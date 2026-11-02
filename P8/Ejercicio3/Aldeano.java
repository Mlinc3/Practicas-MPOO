public class Aldeano extends Personaje {
    // Oficio del aldeano
    private String profesion;

    // Constructor vacío
    public Aldeano() {
        this("Aldeano sin nombre");
    }

    // Constructor simplificado
    public Aldeano(String nombre) {
        this(nombre, 60, 3, 2, "Comerciante");
    }

    // Constructor general
    public Aldeano(String nombre, int vida, int defensa, int ataque,
                   String profesion) {
        super(nombre, vida, defensa, ataque);
        this.profesion = profesion;
    }

    // Muestra una acción sencilla de comercio
    public void comerciar() {
        System.out.println(nombre + ", que trabaja como " + profesion
                + ", ofrece objetos al jugador.");
    }

    // Presenta los atributos generales y la profesión
    @Override
    public String toString() {
        return super.toString()
                + "\nClase: Aldeano"
                + "\nProfesión: " + profesion;
    }
}
