public class Gerente extends Empleado {

    // Departamento administrado por el Gerente
    private String departamento;

    // Constructor
    public Gerente(String nombre, double sueldo, int aniosTrabajo,
                   String departamento) {

        // Llama al constructor de Empleado
        super(nombre, sueldo, aniosTrabajo);

        this.departamento = departamento;
    }

    // Sobrescritura de toString
    @Override
    public String toString() {
        return super.toString()
                + "\nPuesto: Gerente"
                + "\nDepartamento: " + departamento;
    }
}