import java.util.ArrayList;

public class CEO extends Empleado {

    // Empresa que dirige
    private String empresa;

    // Personal administrado por el CEO
    private ArrayList<Arquitecto> arquitectos;
    private ArrayList<Ingeniero> ingenieros;

    // Constructor
    public CEO(String nombre, double sueldo,
               int aniosTrabajo, String empresa) {

        // Llama al constructor de Empleado
        super(nombre, sueldo, aniosTrabajo);

        this.empresa = empresa;

        // Inicializa los ArrayList
        this.arquitectos = new ArrayList<Arquitecto>();
        this.ingenieros = new ArrayList<Ingeniero>();
    }

    // Agrega un Arquitecto
    public void agregarArquitecto(Arquitecto arquitecto) {
        arquitectos.add(arquitecto);
    }

    // Agrega un Ingeniero
    public void agregarIngeniero(Ingeniero ingeniero) {
        ingenieros.add(ingeniero);
    }

    // Sobrescritura de toString
    @Override
    public String toString() {

        return super.toString()
                + "\nPuesto: CEO"
                + "\nEmpresa: " + empresa
                + "\n\n=== PERSONAL A CARGO ==="
                + "\nArquitectos:"
                + "\n" + arquitectos
                + "\n\nIngenieros:"
                + "\n" + ingenieros;
    }
}