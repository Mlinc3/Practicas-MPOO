public class Empleado {

    // Atributos generales de cualquier empleado
    protected String nombre;
    protected double sueldo;
    protected int aniosTrabajo;

    // Constructor
    public Empleado(String nombre, double sueldo, int aniosTrabajo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.aniosTrabajo = aniosTrabajo;
    }

    // Presentación general del empleado
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nSueldo: $" + sueldo
                + "\nAnios de trabajo: " + aniosTrabajo;
    }
}
