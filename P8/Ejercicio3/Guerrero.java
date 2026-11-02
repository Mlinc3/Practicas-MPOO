public class Guerrero extends Personaje {
    // Atributos propios del guerrero
    private int fuerza;
    private double armadura;

    // Constructor vacío
    public Guerrero() {
        this("Guerrero sin nombre");
    }

    // Constructor simplificado
    public Guerrero(String nombre) {
        this(nombre, 120, 10, 18, 12, 5.0);
    }

    // Constructor general
    public Guerrero(String nombre, int vida, int defensa, int ataque,
                    int fuerza, double armadura) {
        super(nombre, vida, defensa, ataque);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    // Realiza un ataque que suma la fuerza al ataque básico
    public void ataquePoderoso(Personaje objetivo) {
        System.out.println(nombre + " realiza un ataque poderoso contra "
                + objetivo.getNombre() + ".");
        objetivo.recibirDanio(ataque + fuerza);
    }

    // Presenta los atributos generales y los atributos del guerrero
    @Override
    public String toString() {
        return super.toString()
                + "\nClase: Guerrero"
                + "\nFuerza: " + fuerza
                + "\nArmadura: " + armadura;
    }
}
