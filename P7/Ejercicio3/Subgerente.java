import java.util.ArrayList;

public class Subgerente extends Empleado {

    // Área administrada por el Subgerente
    private String area;

    // Lista de obreros que tiene a su cargo
    private ArrayList<Obrero> obreros;

    // Constructor
    public Subgerente(String nombre, double sueldo,
                      int aniosTrabajo, String area) {

        // Llama al constructor de Empleado
        super(nombre, sueldo, aniosTrabajo);

        this.area = area;

        // Inicializa el ArrayList
        this.obreros = new ArrayList<Obrero>();
    }

    // Agrega un Obrero a la lista
    public void agregarObrero(Obrero obrero) {
        obreros.add(obrero);
    }

    // Sobrescritura de toString
    @Override
    public String toString() {

        return super.toString()
                + "\nPuesto: Subgerente"
                + "\nArea: " + area
                + "\nObreros y Operarios a cargo: "
                + obreros.size();
    }
}