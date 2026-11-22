package tienda.excepciones;

public class ContrasenaIncorrectaException extends Exception {

    public ContrasenaIncorrectaException(String mensaje) {
        super(mensaje);
    }
}
