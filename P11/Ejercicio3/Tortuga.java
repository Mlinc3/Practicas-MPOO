public class Tortuga extends AnimalBase {
    public Tortuga(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " emite un sonido tenue.");
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " recibe vegetales.");
    }
}
