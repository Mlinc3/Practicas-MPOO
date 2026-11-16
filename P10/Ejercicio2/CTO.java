public class CTO extends Empleado {
    private double compensacionAcciones;

    public CTO(String nombre, double salarioBase, double compensacionAcciones) {
        super(nombre, salarioBase);
        this.compensacionAcciones = compensacionAcciones;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + compensacionAcciones;
    }
}
