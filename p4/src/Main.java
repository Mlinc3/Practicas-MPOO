//Este main es para el analizador de numeros
void main(String[] args) {
    //Se utiliza la terminal para ingresar los valores
    if (args.length == 0){
        System.out.println("Uso: java Analizador num1 num2 ...");
        return;
    }
    //Convertimos la lista args a enteros
    int cantidad = args.length;
    //Este if es para decir que solo se tomaran los 10 primeros valores
    if (cantidad > 10) {
        System.out.println("Solo se permiten máximo 10 números.");
        System.out.println("Se tomarán únicamente los primeros 10.");
        cantidad = 10;
    }
   //Se crea la lista de los numeros ingresados
    int[] numeros = new int[cantidad];
    //El for lo utilizamos para ingresar los datos a la lista de numeros
    for (int i = 0; i < cantidad; i++) {
        numeros[i] = Integer.parseInt(args[i]);
    }
    //instanciamos e inicializamos la clase y utilizamos el metodo para imprimirlo
    AnalizadorDeNumeros analizador = new AnalizadorDeNumeros(numeros);
    //Se coloca asi ya que lo que se obtiene es un string y no se puede poder solo el metodo porque no imprime nada 
    System.out.println(analizador.mostraNumeros());

}
