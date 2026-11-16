
public class Main {

    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[3];

        instrumentos[0] = new Guitarra("Guitarra");
        instrumentos[1] = new Piano("Piano");
        instrumentos[2] = new Bateria("Bateria");

        for(int i = 0; i < instrumentos.length; i++) {
            instrumentos[i].hacerSonido();
        }
    }

}
