/** Valida y realiza depósitos en una cuenta. */
public class Depositos {
    private Cuenta cuenta;

    /** @param cuenta cuenta que recibirá los depósitos */
    public Depositos(Cuenta cuenta) { this.cuenta = cuenta; }

    /**
     * Deposita un monto positivo y registra únicamente operaciones exitosas.
     * El tope técnico del saldo evita perder precisión al manejar centavos.
     * @param monto cantidad en pesos mexicanos, redondeada a dos decimales
     */
    public void depositar(double monto) {
        if (!Double.isFinite(monto) || monto <= 0 || monto > 1000000000000.0) {
            System.out.println("No se puede realizar la operación: monto inválido.");
            return;
        }
        monto = Math.round(monto * 100.0) / 100.0;
        if (monto == 0 || cuenta.getSaldo() + monto > 1000000000000.0) {
            System.out.println("No se puede realizar la operación: monto menor a un centavo o saldo fuera del rango admitido.");
            return;
        }
        cuenta.setSaldo(cuenta.getSaldo() + monto);
        cuenta.registrarMovimiento("Depósito", monto);
        System.out.printf("Depósito realizado: $%.2f MXN%n", monto);
    }
}
