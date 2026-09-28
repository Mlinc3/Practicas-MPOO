public class AnalizadorDeNumeros {
    //Atributos
    int[] numeros;
    //Constructor
    public AnalizadorDeNumeros(int[] numeros){
        this.numeros = numeros;
    }
    //Metodos
    //Aqui igual utulizamos lista simples
    public int mayor() {
        int numMayor = numeros[0];

        for (int num : numeros){
            if (num > numMayor){
                numMayor = num;
            }
        }
        return numMayor;
    }
    //En este se encuentra el mayor de la lista
    public int menor(){
        int numMenor = numeros[0];

        for(int num : numeros){
            if (num < numMenor){
                numMenor = num;
            }
        }

        return numMenor;
    }
    //Aqui el menor de la lista
    public String mostraNumeros(){
        StringBuilder sb = new StringBuilder();
        sb.append("Numero mayor: ").append(mayor()).append("\n");
        sb.append("Numero menor: ").append(menor()).append("\n");
        return sb.toString();
    }
    //Y este metodo para imprimir los dos numeros
}

