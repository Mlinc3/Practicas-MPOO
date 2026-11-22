package tienda.pagos;

public class PagoWallet implements Pago {

    private double saldo;

    @Override
    public boolean procesar(double monto) {
        // TODO
        return false;
    }

    public boolean cobrar(double monto) {
        // TODO: muestra pop-up
        return false;
    }
}
