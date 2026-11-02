public class Villano extends Personaje {
    // Indica si el villano es un jefe
    private boolean esJefe;

    // Constructor vacío
    public Villano() {
        this("Villano sin nombre");
    }

    // Constructor simplificado
    public Villano(String nombre) {
        this(nombre, 150, 8, 16, true);
    }

    // Constructor general
    public Villano(String nombre, int vida, int defensa, int ataque,
                   boolean esJefe) {
        super(nombre, vida, defensa, ataque);
        this.esJefe = esJefe;
    }

    // Muestra una acción descriptiva del villano
    public void invocarEbirros() {
        System.out.println(nombre + " invoca esbirros para ayudarle.");
    }

    // Presenta los atributos generales y si es jefe
    @Override
    public String toString() {
        return super.toString()
                + "\nClase: Villano"
                + "\nEs jefe: " + esJefe;
    }
}
