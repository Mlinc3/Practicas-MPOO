package tienda.articulos.alimentos;

import tienda.articulos.Articulo;

import java.time.LocalDate;

public abstract class Alimentos extends Articulo {
    private LocalDate fechaCaducidad;
    private boolean perecedero;  // true en lácteos, frutas, verduras y salchichonería

    @Override
    public double getPrecioFinal() {
        // TODO: 10% de descuento si faltan 3 días o menos para caducar
        return 0;
    }
}
