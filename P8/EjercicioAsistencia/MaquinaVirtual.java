public class MaquinaVirtual extends RecursoCloud{
    private int vCpus;
    private int ramGb;
    MaquinaVirtual(){
        this("vm-basic",2,4);
    }
    MaquinaVirtual(String nombre, int vCpus, int ramGb) {
        this(nombre, "us-east-1", 0.05, vCpus, ramGb);
    }
    MaquinaVirtual(String nombre, String region, double costoHora, int vCpus, int ramGb){
        super(nombre,region,costoHora);
        this.vCpus = vCpus;
        this.ramGb = ramGb;

        System.out.println("[MaquinaVirtual] lista con " + vCpus + " vCPU");
    }

    @Override
    public String toString(){
        return super.toString() + " | " + vCpus + " vCPU, " + ramGb + " GB RAM";
    }

}
