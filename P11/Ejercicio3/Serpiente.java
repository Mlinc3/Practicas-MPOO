public class Serpiente extends AnimalBase {
    public Serpiente(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " sisea: ¡SSSS!");
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " recibe alimento apropiado para reptiles.");
    }
}
