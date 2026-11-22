package tienda.articulos.moda;

import tienda.articulos.Articulo;

public class Moda extends Articulo {
    private String talla;  // XS a XL
    private String color;

    @Override
    public double getPrecioFinal() {
        // TODO: sin IVA extra; 15% de descuento en temporada
        return 0;
    }
}
