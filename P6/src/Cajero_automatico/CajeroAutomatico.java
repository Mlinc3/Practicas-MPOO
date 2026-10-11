import java.util.Scanner;

/** Controla el menú repetitivo y la lectura de las operaciones. */
public class CajeroAutomatico {
    private Cuenta cuenta;
    private Depositos depositos;
    private Retiros retiros;
    private Scanner sc;

    /**
     * Reutiliza el Scanner de Main para leer desde una sola entrada.
     * @param cuenta cuenta creada al inicio
     * @param sc lector de la consola
     */
    public CajeroAutomatico(Cuenta cuenta, Scanner sc) {
        this.cuenta = cuenta;
        this.sc = sc;
        depositos = new Depositos(cuenta);
        retiros = new Retiros(cuenta);
    }

    /** Repite el menú hasta que el usuario seleccione la opción 4. */
    public void mostrarMenu() {
        String opcion;
        do {
            System.out.println("\nCAJERO AUTOMÁTICO — MXN");
            System.out.println("1. Depositar\n2. Retirar\n3. Consultar saldo\n4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextLine().trim();
            switch (opcion) {
                case "1": opcionDeposito(); break;
                case "2": opcionRetiro(); break;
                case "3": opcionSaldo(); break;
                case "4": System.out.println("Gracias por utilizar el cajero."); break;
                default: System.out.println("Opción no disponible.");
            }
        } while (!opcion.equals("4"));
    }

    /** Lee un monto y solicita el depósito si la entrada es numérica. */
    private void opcionDeposito() {
        double monto = leerMonto();
        if (Double.isFinite(monto)) { depositos.depositar(monto); }
    }

    /** Lee un monto y solicita el retiro si la entrada es numérica. */
    private void opcionRetiro() {
        double monto = leerMonto();
        if (Double.isFinite(monto)) { retiros.retirar(monto); }
    }

    /** Muestra el saldo y los últimos dos movimientos exitosos. */
    private void opcionSaldo() { cuenta.mostrarSaldo(); }

    /**
     * Valida una línea completa con Scanner, sin emplear excepciones.
     * Usa punto decimal y no admite texto adicional ni separadores de miles.
     * @return monto numérico finito, o NaN cuando la entrada es inválida
     */
    private double leerMonto() {
        System.out.print("Monto en MXN (ejemplo: 150.50): ");
        String entrada = sc.nextLine().trim();
        Scanner lector = new Scanner(entrada);
        // java.util.Locale se indica completo para importar solamente Scanner.
        lector.useLocale(java.util.Locale.US);
        double monto = Double.NaN;
        if (!entrada.contains(",") && lector.hasNextDouble()) {
            monto = lector.nextDouble();
            if (lector.hasNext() || !Double.isFinite(monto)) { monto = Double.NaN; }
        }
        lector.close();
        if (!Double.isFinite(monto)) {
            System.out.println("No se puede realizar la operación: ingresa únicamente un número válido.");
        }
        return monto;
    }
}
