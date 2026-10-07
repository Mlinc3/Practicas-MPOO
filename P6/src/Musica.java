public class Musica {

    // Atributos
    public String titulo;
    public int duracion;
    public boolean bloqueada;

    // Constructor
    public Musica(String titulo, int duracion, boolean bloqueada) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.bloqueada = bloqueada;
    }

    // Métodos get
    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public boolean getBloqueada() {
        return bloqueada;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println(titulo + " - " + duracion + " segundos");
    }
}
