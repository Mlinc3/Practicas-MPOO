import java.util.Date;
import java.util.Calendar;

public class Compra {

    // Atributos
    double monto;
    Date fechaCompra;
    Cliente cliente;


    // Constructor
    public Compra(double monto,
                  Date fechaCompra,
                  Cliente cliente) {

        this.monto = monto;
        this.fechaCompra = fechaCompra;
        this.cliente = cliente;
    }


    // Descuento correspondiente a la membresía
    public double aplicarMembresia(double total) {

        switch (cliente.getMembresia()) {

            case PLATA:
                total = total * 0.95;
                break;

            case ORO:
                total = total * 0.92;
                break;

            case DIAMANTE:
                total = total * 0.88;
                break;
        }

        return total;
    }


    // Promociones dependiendo del día
    public double aplicarPromocionDia(double total) {

        Calendar calendario = Calendar.getInstance();

        calendario.setTime(fechaCompra);

        int diaSemana =
                calendario.get(Calendar.DAY_OF_WEEK);


        // Promoción de martes
        if (diaSemana == Calendar.TUESDAY) {

            if (cliente.getMembresia() == Membresia.ORO ||
                    cliente.getMembresia() == Membresia.DIAMANTE) {

                total = total * 0.90;
            }
        }


        // Promoción de lunes y jueves
        else if (diaSemana == Calendar.MONDAY ||
                diaSemana == Calendar.THURSDAY) {

            total = total * 0.88;
        }

        return total;
    }


    public double calcularTotal() {

        /*
         * Primero se verifica cumpleaños porque
         * esta promoción sustituye a todos
         * los demás descuentos.
         */
        if (cliente.esCumpleanios(fechaCompra)) {

            return monto * 0.50;
        }


        double total = monto;

        // Primero descuento de membresía
        total = aplicarMembresia(total);

        // Después descuento correspondiente al día
        total = aplicarPromocionDia(total);

        return total;
    }


    public void mostrarResumen() {

        System.out.println("Monto original: $" + monto);

        System.out.printf(
                "Total a pagar: $%.2f%n",
                calcularTotal()
        );
    }
}