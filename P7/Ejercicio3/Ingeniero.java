public class Ingeniero extends Empleado {

    // Atributos propios del Ingeniero
    private String especialidad;
    private int cedula;

    // Puede ser ACI, CFE, AISC, etc.
    private String norma;

    // Constructor
    public Ingeniero(String nombre, double sueldo, int aniosTrabajo,
                     String especialidad, int cedula, String norma) {

        // Llama al constructor de Empleado
        super(nombre, sueldo, aniosTrabajo);

        this.especialidad = especialidad;
        this.cedula = cedula;
        this.norma = norma;
    }

    // Sobrescritura de toString
    @Override
    public String toString() {
        return super.toString()
                + "\nPuesto: Ingeniero"
                + "\nCedula: " + cedula
                + "\nNorma: " + norma
                + "\nEspecialidad: " + especialidad;
    }
}