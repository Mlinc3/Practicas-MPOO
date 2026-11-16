


class Bateria extends Instrumento{
    public Bateria(String nombre){
        super(nombre);
    }
    @Override
    void hacerSonido(){
        System.out.println(getNombre()+ " hace:ba dum tss");
    }
}
