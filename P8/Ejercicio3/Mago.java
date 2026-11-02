public class Mago extends Personaje {
    // Atributo propio del mago
    private int mana;

    // Constructor vacío
    public Mago() {
        this("Mago sin nombre");
    }

    // Constructor simplificado
    public Mago(String nombre) {
        this(nombre, 90, 4, 12, 30);
    }

    // Constructor general
    public Mago(String nombre, int vida, int defensa, int ataque, int mana) {
        super(nombre, vida, defensa, ataque);
        this.mana = mana;
    }

    // Lanza un hechizo si tiene al menos 10 puntos de maná
    public void lanzarHechizo(Personaje objetivo) {
        if (mana >= 10) {
            System.out.println(nombre + " lanza un hechizo contra "
                    + objetivo.getNombre() + ".");
            mana = mana - 10;
            objetivo.recibirDanio(ataque + 15);
            System.out.println("Maná restante: " + mana);
        } else {
            System.out.println(nombre + " no tiene suficiente maná.");
        }
    }

    // Presenta los atributos generales y el maná
    @Override
    public String toString() {
        return super.toString() + "\nClase: Mago\nManá: " + mana;
    }
}
