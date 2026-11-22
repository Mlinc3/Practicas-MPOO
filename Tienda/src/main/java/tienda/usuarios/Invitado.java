package tienda.usuarios;

import tienda.pedidos.Carrito;

public class Invitado extends Usuario {

    private Carrito carrito;  // solo en memoria, nunca se guarda en disco
}
