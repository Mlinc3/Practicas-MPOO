package tienda.usuarios;

import tienda.articulos.Articulo;
import tienda.excepciones.CorreoDuplicadoException;

public class Administrador extends Usuario {

    public void agregarProducto(Articulo articulo) throws CorreoDuplicadoException {
        // TODO
    }

    public void eliminarProducto(int id) {
        // TODO
    }

    public void eliminarUsuario(int id) {
        // TODO: borra datos y carrito; conserva pedidos
    }
}
