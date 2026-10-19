public class Gato extends Mamifero{

    private String Color;

    public Gato(String Nombre, int Edad, String Dieta, String Color, String Alimento, int Esperanza_vida){
        super (Nombre,Edad,Dieta,Alimento, Esperanza_vida);
        this.Color = Color;
    }

    @Override
    public void Mostrar_info(){
        super.Mostrar_info();
        System.out.println("Color: "+ Color);
    }

    @Override
    public void come(){
        super.come();
    }

}