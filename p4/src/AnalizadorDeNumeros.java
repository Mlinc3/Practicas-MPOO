public class AnalizadorDeNumeros {
    int[] numeros;
    public AnalizadorDeNumeros(int[] numeros){
        this.numeros = numeros;
    }

    public int mayor() {
        int numMayor = numeros[0];

        for (int num : numeros){
            if (num > numMayor){
                numMayor = num;
            }
        }
        return numMayor;
    }

    public int menor(){
        int numMenor = numeros[0];

        for(int num : numeros){
            if (num < numMenor){
                numMenor = num;
            }
        }

        return numMenor;
    }
    public String mostraNumeros(){
        StringBuilder sb = new StringBuilder();
        sb.append("Numero mayor: ").append(mayor()).append("\n");
        sb.append("Numero menor: ").append(menor()).append("\n");
        return sb.toString();
    }

}

