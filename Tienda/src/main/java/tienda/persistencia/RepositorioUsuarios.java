package tienda.persistencia;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import tienda.excepciones.CorreoDuplicadoException;
import tienda.modelo.RegistroUsuario;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class RepositorioUsuarios {

    private final Path archivo;
    private final ObjectMapper mapper = new ObjectMapper();
    private final ReentrantReadWriteLock cerrojo = new ReentrantReadWriteLock();

    public RepositorioUsuarios(Path archivo) {
        this.archivo = archivo;
    }

    // Varios hilos pueden leer a la vez.
    public List<RegistroUsuario> leerTodos() {
        cerrojo.readLock().lock();
        try {
            return leerArchivo();
        } finally {
            cerrojo.readLock().unlock();
        }
    }

    // Solo un hilo escribe, y nadie lee mientras tanto.
    public void guardar(RegistroUsuario nuevo) throws CorreoDuplicadoException {
        cerrojo.writeLock().lock();
        try {
            List<RegistroUsuario> lista = new ArrayList<>(leerArchivo());
            boolean existe = lista.stream()
                    .anyMatch(r -> r.user().equalsIgnoreCase(nuevo.user()));
            if (existe) {
                throw new CorreoDuplicadoException(nuevo.user());
            }
            lista.add(nuevo);
            escribirArchivo(lista);
        } finally {
            cerrojo.writeLock().unlock();
        }
    }

    private List<RegistroUsuario> leerArchivo() {
        try {
            if (!Files.exists(archivo) || Files.size(archivo) == 0) {
                return new ArrayList<>();
            }
            return mapper.readValue(archivo.toFile(),
                    new TypeReference<List<RegistroUsuario>>() {});
        } catch (IOException e) {
            throw new UncheckedIOException("No se pudo leer " + archivo, e);
        }
    }

    private void escribirArchivo(List<RegistroUsuario> lista) {
        try {
            Files.createDirectories(archivo.toAbsolutePath().getParent());
            Path temporal = archivo.resolveSibling(archivo.getFileName() + ".tmp");
            mapper.writerWithDefaultPrettyPrinter().writeValue(temporal.toFile(), lista);
            Files.move(temporal, archivo, StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            throw new UncheckedIOException("No se pudo escribir " + archivo, e);
        }
    }
}