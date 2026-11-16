public class Aguila extends AnimalBase {
    public Aguila(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " grazna.");
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " recibe alimento adecuado para aves rapaces.");
    }
}
