void main(){
    Producto producto = new Producto("Teclado", 450, 10);

    System.out.println(producto);

    // Modificar valores mediante setters
    producto.setPrecio(500);
    producto.setCantidad(15);

    System.out.println("\nProducto actualizado:");
    System.out.println(producto);

    // Consultar valores mediante getters
    System.out.println("\nNombre: " + producto.getNombre());
    System.out.println("Precio: " + producto.getPrecio());
}