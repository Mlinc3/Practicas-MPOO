import java.util.Scanner;
public class MainInventario {
    public static void main(String[] args){
        Scanner ingresar = new Scanner(System.in);
        Inventario inventario = new Inventario();

        int opcion;

        do {

            System.out.println("\nINVENTARIO");
            System.out.println("1.- Agregar producto");
            System.out.println("2.- Buscar producto");
            System.out.println("3.- Actualizar existencia");
            System.out.println("4.- Mostrar inventario");
            System.out.println("5.- Calcular valor total");
            System.out.println("6.- Eliminar producto");
            System.out.println("7.- Salir");
            System.out.print("Seleccione una opción: ");

            opcion = ingresar.nextInt();

            switch (opcion) {

                case 1:
                    // Limpiamos el Enter que queda después de nextInt()
                    ingresar.nextLine();

                    System.out.print("Nombre del producto: ");
                    String nombre = ingresar.nextLine();

                    System.out.print("Precio del producto: ");
                    float precio = ingresar.nextFloat();

                    System.out.print("Existencia del producto: ");
                    int existencia = ingresar.nextInt();

                    inventario.agregarProductos(nombre, precio, existencia);

                    break;

                case 2:
                    inventario.buscarProductos();
                    break;

                case 3:
                    System.out.print("Ingrese el código del producto: ");
                    int codigoActualizar = ingresar.nextInt();

                    System.out.print("Ingrese la nueva existencia: ");
                    int nuevaExistencia = ingresar.nextInt();

                    inventario.actualizarExistencias(codigoActualizar,nuevaExistencia);

                    break;

                case 4:
                    inventario.mostrarInventario();
                    break;

                case 5:
                    double total = inventario.calcularValorInventario();

                    System.out.println("Valor total del inventario: $" + total);

                    break;

                case 6:
                    System.out.print("Ingrese el código del producto a eliminar: ");

                    int codigoEliminar = ingresar.nextInt();

                    inventario.eliminarProductos(codigoEliminar);

                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 7);

        ingresar.close();
    }
}

