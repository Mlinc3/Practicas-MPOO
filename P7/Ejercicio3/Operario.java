public class Operario extends Obrero {

    // Máquina que utiliza el operario
    private String maquina;

    // Constructor
    public Operario(String nombre, double sueldo, int aniosTrabajo,
                    String areaTrabajo, String maquina) {

        // Llama al constructor de Obrero
        super(nombre, sueldo, aniosTrabajo, areaTrabajo);

        this.maquina = maquina;
    }

    // Permite consultar la máquina asignada
    public String getMaquina() {
        return maquina;
    }

    // Sobrescritura de toString
    @Override
    public String toString() {

        return "Nombre: " + nombre
                + "\nSueldo: $" + sueldo
                + "\nAnios de trabajo: " + aniosTrabajo
                + "\nPuesto: Operario"
                + "\nArea de trabajo: " + areaTrabajo
                + "\nMaquina: " + maquina;
    }
}