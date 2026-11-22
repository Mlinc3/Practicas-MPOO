package tienda.articulos.tecnologia;

import tienda.articulos.Articulo;

public class Tecnologia extends Articulo {
    private int garantiaMeses;

    @Override
    public double getPrecioFinal() {
        // TODO: IVA del 16% sobre el precio
        return 0;
    }
}
