
class Piano extends Instrumento{
    public Piano(String nombre){
        super(nombre);
    }
    @Override
    void hacerSonido(){
        System.out.println(getNombre()+ " hace:Plin plin plam");
    }
}
