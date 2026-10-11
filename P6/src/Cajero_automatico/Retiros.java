/** Valida y realiza retiros de hasta 12000 pesos por operación. */
public class Retiros {
    private Cuenta cuenta;
    private static final double LIMITE_RETIRO = 12000.0;

    /** @param cuenta cuenta de la que se retirará dinero */
    public Retiros(Cuenta cuenta) { this.cuenta = cuenta; }

    /**
     * Comprueba el monto, el límite por operación y los fondos disponibles.
     * @param monto cantidad solicitada en pesos mexicanos
     * @return true si se realizó el retiro; false si fue rechazado
     */
    public boolean retirar(double monto) {
        if (!Double.isFinite(monto) || monto <= 0) {
            System.out.println("No se puede realizar la operación: monto inválido.");
            return false;
        }
        if (monto > LIMITE_RETIRO) {
            System.out.println("No se puede realizar la operación: el límite por retiro es $12000.00 MXN.");
            return false;
        }
        monto = Math.round(monto * 100.0) / 100.0;
        if (monto == 0) {
            System.out.println("No se puede realizar la operación: el monto redondeado es cero.");
            return false;
        }
        if (monto > cuenta.getSaldo()) {
            System.out.println("No se puede realizar la operación: saldo insuficiente.");
            return false;
        }
        cuenta.setSaldo(cuenta.getSaldo() - monto);
        cuenta.registrarMovimiento("Retiro", monto);
        System.out.printf("Retiro realizado: $%.2f MXN%n", monto);
        return true;
    }
}
