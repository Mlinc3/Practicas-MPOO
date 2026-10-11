import java.util.Scanner;

/** Inicia la aplicación y crea la cuenta con saldo cero. */
public class Main {
    /**
     * Solicita los datos de la cuenta y abre el menú del cajero.
     * @param args argumentos de ejecución, no utilizados
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CREACIÓN DE CUENTA");
        int numeroCuenta = 0;
        while (numeroCuenta <= 0) {
            System.out.print("Número de cuenta (entero positivo): ");
            Scanner lector = new Scanner(sc.nextLine());
            if (lector.hasNextInt()) {
                numeroCuenta = lector.nextInt();
                if (lector.hasNext()) { numeroCuenta = 0; }
            }
            lector.close();
            if (numeroCuenta <= 0) {
                System.out.println("No se puede crear la cuenta: número inválido.");
            }
        }
        String titular;
        do {
            System.out.print("Nombre del titular: ");
            titular = sc.nextLine().trim();
            if (titular.isEmpty()) { System.out.println("El nombre no puede estar vacío."); }
        } while (titular.isEmpty());
        Cuenta cuenta = new Cuenta(numeroCuenta, titular, 0.0);
        System.out.println("Cuenta creada con saldo inicial de $0.00 MXN.");
        CajeroAutomatico cajero = new CajeroAutomatico(cuenta, sc);
        cajero.mostrarMenu();
        sc.close();
    }
}
