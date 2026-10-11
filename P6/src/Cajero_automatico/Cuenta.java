/**
 * Conserva los datos de una cuenta y su historial durante la ejecución.
 * Los movimientos se guardan en una lista de textos, sin crear otra clase.
 */
public class Cuenta {
    private int numeroCuenta;
    private String titular;
    private double saldo;
    private java.util.ArrayList<String> movimientos;

    /**
     * Crea una cuenta sin movimientos previos.
     * @param numeroCuenta identificador positivo de la cuenta
     * @param titular nombre del propietario
     * @param saldo saldo inicial no negativo
     */
    public Cuenta(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.movimientos = new java.util.ArrayList<String>();
        setSaldo(saldo);
    }

    /** @return saldo actual en pesos mexicanos */
    public double getSaldo() { return saldo; }

    /**
     * Actualiza el saldo con dos decimales si es válido.
     * @param saldo nuevo saldo, finito y no negativo
     */
    public void setSaldo(double saldo) {
        if (Double.isFinite(saldo) && saldo >= 0 && saldo <= 1000000000000.0) {
            this.saldo = Math.round(saldo * 100.0) / 100.0;
        }
    }

    /** @return número de cuenta */
    public int getNumeroCuenta() { return numeroCuenta; }

    /** @return nombre del titular */
    public String getTitular() { return titular; }

    /**
     * Agrega un movimiento exitoso con un número consecutivo.
     * @param tipo Depósito o Retiro
     * @param monto cantidad aplicada al saldo
     */
    public void registrarMovimiento(String tipo, double monto) {
        int numero = movimientos.size() + 1;
        movimientos.add(String.format("Movimiento %d | %s | $%.2f MXN", numero, tipo, monto));
    }

    /** Muestra el saldo y hasta los dos movimientos más recientes. */
    public void mostrarSaldo() {
        System.out.println("Cuenta: " + numeroCuenta + " | Titular: " + titular);
        System.out.printf("Saldo: $%.2f MXN%n", saldo);
        if (movimientos.isEmpty()) {
            System.out.println("Sin movimientos registrados.");
        } else {
            System.out.println("Últimos dos movimientos (del más reciente al anterior):");
            int inicio = movimientos.size() - 1;
            for (int i = inicio; i >= 0 && i >= inicio - 1; i--) {
                System.out.println(movimientos.get(i));
            }
        }
    }
}
