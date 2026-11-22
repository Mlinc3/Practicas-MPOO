package tienda.pedidos;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {

    private int id;
    private LocalDateTime fecha;
    private double total;
    private List<LineaPedido> lineas;  // copia de nombre y precio al momento de la compra
}
