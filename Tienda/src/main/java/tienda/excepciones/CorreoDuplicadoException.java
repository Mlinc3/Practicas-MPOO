package tienda.excepciones;

public class CorreoDuplicadoException extends Exception {

    public CorreoDuplicadoException(String correo) {
        super("Ya existe una cuenta con el correo " + correo);
    }
}