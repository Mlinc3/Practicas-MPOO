package tienda.usuarios;

public abstract class Usuario {

    private String correo;      // único, con formato válido
    private String contrasena;  // guardada como hash
    private String nombre;

    public boolean autenticar(String contrasena) {
        // TODO
        return false;
    }
}
