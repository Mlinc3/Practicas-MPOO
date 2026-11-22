package tienda.modelo;

import java.util.Optional;

public interface Autenticable {

    Optional<RegistroUsuario> autenticar(String correo, String contrasena);
}