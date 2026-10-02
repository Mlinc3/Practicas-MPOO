public static void main(String[] args) {

        // =========================
        // CP-1
        // =========================

        System.out.println("CP-1");

        System.out.printf("%.2f%n", ConversorADC.aCelsius(0));
        System.out.printf("%.2f%n", ConversorADC.aCelsius(93));
        System.out.printf("%.2f%n", ConversorADC.aCelsius(1023));


        // =========================
        // CP-2 - Clasificar
        // =========================

        System.out.println("\nCP-2 - Clasificar");

        System.out.println(ConversorADC.clasificar(17.99));
        System.out.println(ConversorADC.clasificar(18.0));
        System.out.println(ConversorADC.clasificar(26.0));
        System.out.println(ConversorADC.clasificar(26.01));


        // =========================
        // CP-2 - Redondear
        // =========================

        System.out.println("\nCP-2 - Redondear");

        System.out.println(ConversorADC.redondear(2.5));
        System.out.println(ConversorADC.redondear(-2.5));
        System.out.println(ConversorADC.redondear(-0.4));
        System.out.println(ConversorADC.redondear(-7.51));


        // =========================
        // CP-3 - Promedio
        // =========================

        System.out.println("\nCP-3");

        int[] lecturas1 = {
                93, 186, 279, 1500, -5, 1023
        };

        double promedio1 =
                ConversorADC.promedioCelsius(lecturas1);

        System.out.printf("%.2f%n", promedio1);


        // Caso sin lecturas válidas
        int[] lecturas2 = {2000};

        double promedio2 =
                ConversorADC.promedioCelsius(lecturas2);

        System.out.println(promedio2);
}