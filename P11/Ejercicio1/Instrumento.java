

public abstract class Instrumento {
    private String nombre;
    public Instrumento(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    abstract void hacerSonido();
}