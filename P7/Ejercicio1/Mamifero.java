public class Mamifero {
    private String Nombre;
    private int Edad;
    private String Dieta;
    private String Alimento;
    int Esperanza_vida;

    public Mamifero (String Nombre, int Edad, String Dieta, String Alimento,int Esperanza_vida){
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Dieta = Dieta;
        this.Alimento = Alimento;
        this.Esperanza_vida = Esperanza_vida;
    }


    public void Mostrar_info(){
        System.out.println("Nombre : "+ Nombre);
        System.out.println("Edad : "+Edad+"Años");
        System.out.println("Esperanza de vida: "+Esperanza_vida + "Años");
        System.out.println("Dieta :"+ Dieta);

    }

    public void come(){
        System.out.println("Comida usual: "+ Alimento);
    }

}
