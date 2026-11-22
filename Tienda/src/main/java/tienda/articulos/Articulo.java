package tienda.articulos;

import tienda.excepciones.StockInsuficienteException;

public abstract class Articulo {
    private int id;
    private String nombre;
    private double precio;      // mayor a 0
    private int stock;          // 0 o más
    private String imagen;      // por defecto img/generica.png

    public abstract double getPrecioFinal();

    public void descontarStock(int cantidad) throws StockInsuficienteException {
        // TODO
    }
}
