//Este main es para el analizador de numeros
void main(String[] args) {
    if (args.length == 0){
        System.out.println("Uso: java Analizador num1 num2 ...");
        return;
    }
    int cantidad = args.length;

    if (cantidad > 10) {
        System.out.println("Solo se permiten máximo 10 números.");
        System.out.println("Se tomarán únicamente los primeros 10.");
        cantidad = 10;
    }

    int[] numeros = new int[cantidad];

    for (int i = 0; i < cantidad; i++) {
        numeros[i] = Integer.parseInt(args[i]);
    }

    AnalizadorDeNumeros analizador = new AnalizadorDeNumeros(numeros);

    analizador.mostraNumeros();

}
