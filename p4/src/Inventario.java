import java.util.Scanner;
import java.util.ArrayList;
public class Inventario {
    //atributos

    ArrayList<String> nombres = new ArrayList<>();
    ArrayList<Float> precios = new ArrayList<>();
    ArrayList<Integer> existencias = new ArrayList<>();
    ArrayList<Integer> codigos = new ArrayList<>();
    int siguienteCodigo;
    //Utilizamos Arraylist para que sea dinamica y podamos ingresas los productos necesarios
    //Tambien llegamos a la conclucion que para una facil gestion se le asiganara codigos a los productos

    //Constructor
    public Inventario(){
        nombres = new ArrayList<>();
        precios = new ArrayList<>();
        existencias = new ArrayList<>();
        int siguienteCodigo = 1001;
    }

    //Metodos
    public void agregarProductos(String nombre,float precio,int existencia){
        if (precio < 0 || existencia < 0) {
            System.out.println("El precio y la existencia no pueden ser negativos.");
            return;
        }
        //Se verifica primero que lo que se vaya agregar precios ni existencias con valor negativo, con el if y and(||)
        int codigo = generarCodigo();

        codigos.add(codigo);
        nombres.add(nombre);
        precios.add(precio);
        existencias.add(existencia);

        System.out.println("Producto agregado correctamente.");
        System.out.println("Código asignado: " + codigo);
    }

    public int generarCodigo(){
        int codigo = siguienteCodigo;
        siguienteCodigo ++;
        return codigo;
    }
    //Aqui primero se utiliza el primer codigo para que se pueda sumar en una unidad para el siguiente producto

    public void buscarProductos(){
        Scanner op = new Scanner(System.in);
        int opcion;
        int codigo;
        do{
            System.out.println("1.- Buscar por codigo: ");
            System.out.println("2.- Regresar");
            opcion = op.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el codigo del producto: ");
                    codigo = op.nextInt();
                    boolean encontrado = false;
                    for (int i = 0; i < codigos.size(); i++) {
                        //Se verifica la existencia del codigo del producto a buscar
                        if (codigos.get(i) == codigo) {
                            mostrarProducto(i);
                            encontrado = true;
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 2: System.out.println("Regresando..."); break;
                default: System.out.println("Opcion no valida");
            }
        }while (opcion != 2);
        op.close();
    }

    public void actualizarExistencias(int codigo, int nuevaExistencia){
        if (nuevaExistencia < 0) {
            System.out.println("La existencia no puede ser negativa.");
            return;
        }
        //Se verifica que no se llegue o actualicemos con existencia negativas
        for (int i = 0; i < codigos.size(); i++) {

            if (codigos.get(i) == codigo) {

                existencias.set(i, nuevaExistencia);

                System.out.println("Existencia actualizada.");
                return;
            }
        }

        System.out.println("Producto no encontrado.");
    }

    public void eliminarProductos(int codigo){

        for (int i = 0; i < codigos.size(); i++) {

            if (codigos.get(i) == codigo) {

                System.out.println("Eliminando producto:");
                mostrarProducto(i);

                codigos.remove(i);
                nombres.remove(i);
                precios.remove(i);
                existencias.remove(i);

                System.out.println("Producto eliminado correctamente.");
                return;
            }
        }
    }

    public Float calcularValorInventario(){
        float total = 0;

        for (int i = 0; i < precios.size(); i++) {

            total += precios.get(i) * existencias.get(i);
        }

        return total;
    }

    public void mostrarInventario(){
        if (nombres.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        System.out.println("\n*** INVENTARIO ***");

        for (int i = 0; i < nombres.size(); i++) {

            System.out.println("Código: " + codigos.get(i) + " | Nombre: " + nombres.get(i) + " | Precio: $" + precios.get(i) + " | Existencia: " + existencias.get(i));
        }
    }
    public void mostrarProducto(int i){
        System.out.println("\n*** PRODUCTO ***");
        System.out.println("Código: " + codigos.get(i));
        System.out.println("Nombre: " + nombres.get(i));
        System.out.println("Precio: $" + precios.get(i));
        System.out.println("Existencia: " + existencias.get(i));
    }
    //separamos el metodo de buscar productos en dos para que se vea mas estetico
}
