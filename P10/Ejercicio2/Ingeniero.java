public class Ingeniero extends Empleado {
    private double horasExtra;
    private double pagoPorHoraExtra;

    public Ingeniero(String nombre, double salarioBase, double horasExtra, double pagoPorHoraExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtra * pagoPorHoraExtra);
    }
}
