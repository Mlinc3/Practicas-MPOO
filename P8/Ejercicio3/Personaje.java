public class Personaje {
    // Atributos comunes a todos los personajes
    protected String nombre;
    protected int vida;
    protected int defensa;
    protected int ataque;

    // Constructor vacío
    public Personaje() {
        this("Sin nombre");
    }

    // Constructor simplificado
    public Personaje(String nombre) {
        this(nombre, 100, 5, 10);
    }

    // Constructor general
    public Personaje(String nombre, int vida, int defensa, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
    }

    // Realiza un ataque básico contra otro personaje
    public void hacerDanio(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.getNombre() + ".");
        objetivo.recibirDanio(ataque);
    }

    // Reduce la vida considerando la defensa del objetivo
    public void recibirDanio(int cantidad) {
        int danioReal = cantidad - defensa;

        if (danioReal < 1) {
            danioReal = 1;
        }

        vida = vida - danioReal;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nombre + " recibe " + danioReal
                + " de daño. Vida restante: " + vida);
    }

    // Muestra una acción básica de movimiento
    public void caminar() {
        System.out.println(nombre + " camina por el mundo.");
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return nombre;
    }

    // Devuelve la vida actual
    public int getVida() {
        return vida;
    }

    // Presenta los atributos generales
    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nVida: " + vida
                + "\nDefensa: " + defensa
                + "\nAtaque: " + ataque;
    }
}
