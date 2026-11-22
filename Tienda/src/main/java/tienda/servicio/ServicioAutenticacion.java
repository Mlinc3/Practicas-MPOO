package tienda.servicio;

import tienda.excepciones.CorreoDuplicadoException;
import tienda.modelo.Autenticable;
import tienda.modelo.RegistroUsuario;
import tienda.modelo.Rol;
import tienda.persistencia.RepositorioUsuarios;
import tienda.seguridad.HashContrasena;

import java.util.Optional;

public final class ServicioAutenticacion implements Autenticable {

    private final RepositorioUsuarios repositorio;
    private final HashContrasena hash;

    public ServicioAutenticacion(RepositorioUsuarios repositorio, HashContrasena hash) {
        this.repositorio = repositorio;
        this.hash = hash;
    }

    @Override
    public Optional<RegistroUsuario> autenticar(String correo, String contrasena) {
        return repositorio.leerTodos().stream()
                .filter(r -> r.user().equalsIgnoreCase(correo))
                .filter(r -> hash.verificar(contrasena, r.password()))
                .findFirst();
    }

    // El hash se calcula antes de pedir el candado de escritura.
    public void registrar(String correo, String contrasena, Rol rol)
            throws CorreoDuplicadoException {
        String cifrada = hash.cifrar(contrasena);
        repositorio.guardar(new RegistroUsuario(correo.toLowerCase(), cifrada, rol));
    }
}