public class Leon extends AnimalBase {
    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ruge: ¡GRRR!");
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " recibe carne.");
    }
}
