import java.time.LocalDate;

public class TarjetaDeCredito extends MetodoPago {
    private LocalDate fechaPago;

    public TarjetaDeCredito(String titular, double monto) {
        super(titular, monto);
        this.fechaPago = LocalDate.now();
    }

    public TarjetaDeCredito(String titular, double monto, LocalDate fechaPago) {
        super(titular, monto);
        this.fechaPago = fechaPago;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
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

        // Comisión fija del 15% durante todo el año
        double porcentajeComision = 15.0;
        double importeComision = monto * (porcentajeComision / 100.0);
        double totalPagar = monto + importeComision;

        // Desglose de resultados en pantalla
        System.out.println("**************");
        System.out.println("Tipo de tarjeta: Tarjeta de Crédito");
        System.out.println("Titular: " + titular);
        if (fechaPago != null) {
            System.out.println("Fecha de pago: " + fechaPago + " (" + fechaPago.getDayOfWeek() + ")");
        }
        System.out.printf("Monto original: $%.2f%n", monto);
        System.out.println("Porcentaje de comisión aplicado: " + porcentajeComision + "%");
        System.out.printf("Importe de la comisión: $%.2f%n", importeComision);
        System.out.printf("Total a pagar: $%.2f%n", totalPagar);
        System.out.println("**************");
    }
}