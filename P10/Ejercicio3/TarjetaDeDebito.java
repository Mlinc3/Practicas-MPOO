import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class TarjetaDeDebito extends MetodoPago {
    private LocalDate fechaPago;
    private ArrayList<LocalDate> diasFestivos;

    // Constructor que invoca a la clase padre con super()
    public TarjetaDeDebito(String titular, double monto, LocalDate fechaPago, ArrayList<LocalDate> diasFestivos) {
        super(titular, monto);
        this.fechaPago = fechaPago;
        this.diasFestivos = diasFestivos;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public ArrayList<LocalDate> getDiasFestivos() {
        return diasFestivos;
    }

    public void setDiasFestivos(ArrayList<LocalDate> diasFestivos) {
        this.diasFestivos = diasFestivos;
    }

    @Override
    public void procesarPago() {
        // Validación de monto mayor a cero
        if (monto <= 0) {
            System.out.println("**************");
            System.out.println("Error: No se puede procesar el pago de " + titular + ". El monto ($" + monto + ") debe ser mayor que cero.");
            System.out.println("**************");
            return;
        }

        // Identificación del día de la semana con DayOfWeek
        DayOfWeek diaSemana = fechaPago.getDayOfWeek();
        boolean esFinDeSemana = (diaSemana == DayOfWeek.SATURDAY || diaSemana == DayOfWeek.SUNDAY);

        // Verificación de si la fecha corresponde a un día festivo
        boolean esFestivo = false;
        if (diasFestivos != null) {
            for (LocalDate festivo : diasFestivos) {
                if (festivo.equals(fechaPago)) {
                    esFestivo = true;
                    break;
                }
            }
        }

        // Reglas de comisión:
        // - Fines de semana o festivos: 0% de comisión.
        // - De lunes a viernes (no festivos): 10% de comisión.
        double porcentajeComision;
        if (esFestivo || esFinDeSemana) {
            porcentajeComision = 0.0;
        } else {
            porcentajeComision = 10.0;
        }

        double importeComision = monto * (porcentajeComision / 100.0);
        double totalPagar = monto + importeComision;

        // Desglose de resultados en pantalla
        System.out.println("**************");
        System.out.println("Tipo de tarjeta: Tarjeta de Débito");
        System.out.println("Titular: " + titular);
        System.out.println("Fecha de pago: " + fechaPago + " (" + diaSemana + (esFestivo ? " - Día Festivo" : "") + ")");
        System.out.printf("Monto original: $%.2f%n", monto);
        System.out.println("Porcentaje de comisión aplicado: " + porcentajeComision + "%");
        System.out.printf("Importe de la comisión: $%.2f%n", importeComision);
        System.out.printf("Total a pagar: $%.2f%n", totalPagar);
        System.out.println("**************");
    }
}