public class RecursoCloud {
    protected String nombre;
    protected String region;
    protected double costoHora;
    //CONSTRUCTORES
    public RecursoCloud() {
        this("sin-nombre");
    }
    public RecursoCloud(String nombre) {
        this(nombre, "us-east-1", 0.05);
    }
    RecursoCloud(String nombre, String region, double costoHora){
        this.nombre = nombre;
        this.region = region;
        this.costoHora= costoHora;

        System.out.println("[RecursosCloud] creando " + nombre);
    }

    @Override
    public String toString(){
        return nombre + " | " + region + " | $" + costoHora + "/h";
    }
}
