public class ModeloIA extends RecursoCloud{
    private int parametrosB;
    private  boolean usaGpu;
    ModeloIA(String nombre,int parametrosB){
        super(nombre,"us-west-1",2.50);
        this.parametrosB=parametrosB;
        this.usaGpu = true;

        System.out.println("[ModeloIA] cargado con " + parametrosB + "B parametros");
    }
    @Override
    public String toString(){
        return super.toString() + " | " + parametrosB + "B params, " + "GPU: " + true;
    }
}
