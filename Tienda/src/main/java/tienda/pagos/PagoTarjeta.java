package tienda.pagos;

import java.time.YearMonth;

public class PagoTarjeta implements Pago {

    private String numero;  // 15 o 16 dígitos
    private YearMonth vencimiento;
    private Marca marca;

    @Override
    public boolean procesar(double monto) {
        // TODO
        return false;
    }

    public Marca detectarMarca() {
        // TODO: por BIN
        return null;
    }
}
