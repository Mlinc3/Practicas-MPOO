public class Delfin extends AnimalBase implements Entrenable {
    public Delfin(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " emite chasquidos y silbidos.");
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " recibe pescado.");
    }

    @Override
    public void entrenar() {
        System.out.println(getNombre() + " practica saltos y ejercicios acuaticos.");
    }
}
