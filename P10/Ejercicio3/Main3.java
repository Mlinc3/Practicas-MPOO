import java.time.LocalDate;
import java.util.ArrayList;
void main() {
    ArrayList<MetodoPago> pagos = new ArrayList<>();
    ArrayList<LocalDate> diasFestivos = new ArrayList<>();
    // 1. Registro manual de días festivos en el calendario
    diasFestivos.add(LocalDate.of(2026, 1, 1));   // Año Nuevo
    diasFestivos.add(LocalDate.of(2026, 2, 5));   // Día de la Constitución
    diasFestivos.add(LocalDate.of(2026, 5, 1));   // Día del Trabajo (Viernes)
    diasFestivos.add(LocalDate.of(2026, 9, 16));  // Día de la Independencia (Miércoles)
    diasFestivos.add(LocalDate.of(2026, 11, 20)); // Revolución Mexicana
    diasFestivos.add(LocalDate.of(2026, 12, 25)); // Navidad (Viernes)
    // 2. Registro de pagos en la colección común ArrayList<MetodoPago>
    // Caso 1: Tarjeta de Débito en día laboral ordinario (Miércoles) -> 10% comisión
    pagos.add(new TarjetaDeDebito("Carlos Perez", 1500.0, LocalDate.of(2026, 10, 14), diasFestivos));
    // Caso 2: Tarjeta de Débito en fin de semana (Sábado) -> 0% comisión
    pagos.add(new TarjetaDeDebito("Ana Gomez", 2000.0, LocalDate.of(2026, 10, 17), diasFestivos));
    // Caso 3: Tarjeta de Débito en día festivo entre semana (1 de mayo - Viernes) -> 0% comisión
    pagos.add(new TarjetaDeDebito("Roberto Diaz", 3500.0, LocalDate.of(2026, 5, 1), diasFestivos));
    // Caso 4: Tarjeta de Crédito en día laboral -> 15% comisión fija
    pagos.add(new TarjetaDeCredito("Laura Fernandez", 1000.0, LocalDate.of(2026, 10, 14)));
    // Caso 5: Tarjeta de Crédito en fin de semana -> 15% comisión fija
    pagos.add(new TarjetaDeCredito("Miguel Sanchez", 4200.0, LocalDate.of(2026, 10, 18)));
    // Caso 6: Tarjeta de Crédito en día festivo -> 15% comisión fija
    pagos.add(new TarjetaDeCredito("Sofia Morales", 2800.0, LocalDate.of(2026, 9, 16)));
    // Caso 7: Validación de monto menor o igual a cero
    pagos.add(new TarjetaDeDebito("Elena Rios", -500.0, LocalDate.of(2026, 10, 14), diasFestivos));
    // 3. Procesamiento polimórfico mediante ciclo for-each
    System.out.println("**************");
    System.out.println("SISTEMA DE PROCESAMIENTO DE PAGOS");
    System.out.println("**************");
    for (MetodoPago pago : pagos) {
        // Invocación polimórfica sin instanceof ni downcasting
        pago.procesarPago();
    }
}
