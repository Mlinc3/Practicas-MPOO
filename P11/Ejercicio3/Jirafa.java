public class Jirafa extends AnimalBase {
    public Jirafa(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " emite un sonido suave.");
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " recibe hojas y ramas.");
    }
}
