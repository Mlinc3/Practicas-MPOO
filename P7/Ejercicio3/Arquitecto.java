public class Arquitecto extends Empleado {

    // Atributos propios del Arquitecto
    private int cedula;
    private String estilo;

    // Constructor
    public Arquitecto(String nombre, double sueldo, int aniosTrabajo,
                      int cedula, String estilo) {

        // Llama al constructor de Empleado
        super(nombre, sueldo, aniosTrabajo);

        this.cedula = cedula;
        this.estilo = estilo;
    }

    // Sobrescritura de toString
    @Override
    public String toString() {
        return super.toString()
                + "\nPuesto: Arquitecto"
                + "\nCedula: " + cedula
                + "\nEstilo de trabajo: " + estilo;
    }
}