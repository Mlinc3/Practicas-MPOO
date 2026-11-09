public class Gerente extends Empleado {
    private double bonoGerencial;

    public Gerente(String nombre, double salarioBase, double bonoGerencial) {
        super(nombre, salarioBase);
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonoGerencial;
    }
}
