package tienda.pagos;

public class PagoTransferencia implements Pago {

    private String clabe;  // 18 dígitos
    private String banco;

    @Override
    public boolean procesar(double monto) {
        // TODO
        return false;
    }

    public String mostrarDatos() {
        // TODO
        return null;
    }
}
