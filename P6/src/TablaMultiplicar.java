public class TablaMultiplicar {
    int numero;
    TablaMultiplicar(int numero){
        this.numero=numero;
    }
    public void tabla(int numero){
        for(int i=1; i<=10 ; i++){
            System.out.println(numero + "x" + i + " = " + i*numero);
        }
    }

}
