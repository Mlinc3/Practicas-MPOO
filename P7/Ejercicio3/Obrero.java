public class Obrero extends Empleado {

    // protected porque Operario hereda de Obrero
    protected String areaTrabajo;

    // Constructor
    public Obrero(String nombre, double sueldo, int aniosTrabajo,
                  String areaTrabajo) {

        // Llama al constructor de Empleado
        super(nombre, sueldo, aniosTrabajo);

        this.areaTrabajo = areaTrabajo;
    }

    // Sobrescritura de toString
    @Override
    public String toString() {
        return super.toString()
                + "\nPuesto: Obrero"
                + "\nArea de trabajo: " + areaTrabajo;
    }
}