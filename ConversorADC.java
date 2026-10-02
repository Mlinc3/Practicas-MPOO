public class ConversorADC {
    //atributo
    static final double VREF = 1.1;
    static final int RESOLUCION_MAX = 1023;
    //metodos
    public static double aVoltaje(int lectura){
        return (lectura * VREF )/ RESOLUCION_MAX;
    }

    public static double aCelsius(int lectura){
        return aVoltaje(lectura)*100;
    }

    public static String clasificar(double celcius){

        return celcius < 18 ? "FRIO" : celcius <= 26 ? "CONFORT" : "CALOR";
    }

    public static int redondear(double valor){
        if (valor >= 0){
            return (int)(valor + 0.5);
        } else{
            return  (int)(valor - 0.5);
        }
    }

    public static double promedioCelsius(int [] lecturas ){
        int suma = 0;
        int cantidad = 0;

        int menor = RESOLUCION_MAX;
        int mayor = 0;


        for (int lectura : lecturas) {

            // Solo procesamos lecturas válidas
            if (lectura >= 0 && lectura <= RESOLUCION_MAX) {

                suma += lectura;
                cantidad++;

                if (lectura < menor) {
                    menor = lectura;
                }

                if (lectura > mayor) {
                    mayor = lectura;
                }
            }
        }


        // No hubo lecturas válidas
        if (cantidad == 0) {
            return Double.NaN;
        }


        // Si existen 4 o más lecturas válidas,
        // quitamos una menor y una mayor.
        if (cantidad >= 4) {

            suma = suma - menor - mayor;
            cantidad = cantidad - 2;
        }


        // Evitamos división entera
        double promedioADC = (double)suma / cantidad;

        // ADC -> voltaje -> Celsius
        return promedioADC * VREF / RESOLUCION_MAX * 100;
    }
}
