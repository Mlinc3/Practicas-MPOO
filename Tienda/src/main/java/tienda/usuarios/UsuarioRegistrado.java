package tienda.usuarios;

import tienda.articulos.Articulo;
import tienda.excepciones.ContrasenaIncorrectaException;
import tienda.pedidos.Carrito;
import tienda.pedidos.Pedido;

import java.util.List;

public class UsuarioRegistrado extends Usuario {

    private int id;
    private Carrito carrito;  // se guarda en JSON
    private List<Pedido> historial;

    public void agregarAlCarrito(Articulo articulo) {
        // TODO
    }

    public boolean eliminarCuenta(String contrasena) throws ContrasenaIncorrectaException {
        // TODO
        return false;
    }
}
