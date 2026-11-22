package tienda;

import tienda.config.Configuracion;
import tienda.modelo.Rol;
import tienda.persistencia.RepositorioUsuarios;
import tienda.seguridad.HashContrasena;
import tienda.servicio.ServicioAutenticacion;

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {
        Path archivo = Path.of(Configuracion.obtener("RUTA_USUARIOS", "data/users.json"));
        HashContrasena hash = new HashContrasena(Configuracion.obtenerObligatoria("PIMIENTA"));
        RepositorioUsuarios repositorio = new RepositorioUsuarios(archivo);
        ServicioAutenticacion auth = new ServicioAutenticacion(repositorio, hash);

        // Inicio limpio: si no hay usuarios, se crea el administrador desde .env.
        if (repositorio.leerTodos().isEmpty()) {
            auth.registrar(
                    Configuracion.obtenerObligatoria("ADMIN_CORREO"),
                    Configuracion.obtenerObligatoria("ADMIN_CONTRASENA"),
                    Rol.ADMINISTRADOR);
            System.out.println("Administrador creado.");
        }

        auth.autenticar(Configuracion.obtenerObligatoria("ADMIN_CORREO"),
                        Configuracion.obtenerObligatoria("ADMIN_CONTRASENA"))
                .ifPresentOrElse(
                        r -> System.out.println("Acceso correcto con rol " + r.rol()),
                        () -> System.out.println("Credenciales inválidas"));
    }
}