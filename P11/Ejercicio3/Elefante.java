public class Elefante extends AnimalBase {
    public Elefante(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " barrita: ¡PRUUU!");
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " recibe frutas y vegetales.");
    }
}
