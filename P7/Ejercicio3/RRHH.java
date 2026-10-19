public class RRHH extends Empleado {

    // Área específica de Recursos Humanos
    private String areaRRHH;

    // Constructor
    public RRHH(String nombre, double sueldo,
                int aniosTrabajo, String areaRRHH) {

        // Llama al constructor de Empleado
        super(nombre, sueldo, aniosTrabajo);

        this.areaRRHH = areaRRHH;
    }

    // Sobrescritura de toString
    @Override
    public String toString() {

        return super.toString()
                + "\nPuesto: Recursos Humanos"
                + "\nArea de RRHH: " + areaRRHH;
    }
}