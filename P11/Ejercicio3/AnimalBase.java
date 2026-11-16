public abstract class AnimalBase implements Animal {
    private String nombre;
    private int edad;

    public AnimalBase(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public int getEdad() { return edad; }

    @Override
    public String getEspecie() { return getClass().getSimpleName(); }

    @Override
    public void presentarse() {
        System.out.println("Especie: " + getEspecie() + " | Nombre: " + nombre + " | Edad: " + edad + " años");
    }

    @Override
    public abstract void emitirSonido();

    @Override
    public abstract void alimentarse();
}
