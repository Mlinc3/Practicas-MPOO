public class Cuenta {

    // Atributos privados
    private String titular;
    private double saldo;

    // Constructor
    public Cuenta(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    // Getter del titular
    public String getTitular() {
        return titular;
    }

    // Setter del titular
    public void setTitular(String titular) {
        if (titular != null && !titular.trim().isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Error: el titular no puede estar vacío.");
        }
    }

    // Getter del saldo
    public double getSaldo() {
        return saldo;
    }

    // Setter del saldo
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: el saldo no puede ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "Titular: " + titular + "\nSaldo: $" + saldo;
    }
}