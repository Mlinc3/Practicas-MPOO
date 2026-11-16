public class MetodoPago {
    protected String titular;
    protected double monto;

    public MetodoPago(String titular, double monto) {
        this.titular = titular;
        setMonto(monto);
    }

    // Getters y Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        if (monto <= 0) {
            System.out.println("Advertencia: El monto para " + this.titular + " debe ser mayor a cero.");
        }
        this.monto = monto;
    }

    // Metodo que será sobrescrito por las clases hijas aplicando polimorfismo
    public void procesarPago() {
        System.out.println("Procesando pago general para " + titular + " por un monto de $" + monto);
    }
}