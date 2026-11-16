public class Mono extends AnimalBase implements Entrenable {
    public Mono(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " chilla: ¡U-U-A-A!");
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " recibe frutas.");
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " realiza ejercicios de agilidad y aprende trucos.");
    }
}
