

class Guitarra extends Instrumento {
    public Guitarra(String nombre){
        super(nombre);
    }
    @Override
    void hacerSonido(){
            System.out.println(getNombre()+ " hace:strum");
    }
}
