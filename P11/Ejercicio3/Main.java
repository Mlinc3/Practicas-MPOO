import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Animal> zoologico = new ArrayList<>();

        // Registro inicial de veinte animales.
        zoologico.add(new Leon("Simba", 5));
        zoologico.add(new Leon("Kiara", 4));
        zoologico.add(new Leon("Mufasa", 8));
        zoologico.add(new Elefante("Dumbo", 12));
        zoologico.add(new Elefante("Luna", 9));
        zoologico.add(new Elefante("Trompa", 15));
        zoologico.add(new Jirafa("Sophie", 6));
        zoologico.add(new Jirafa("Cuello", 7));
        zoologico.add(new Jirafa("Manchas", 3));
        zoologico.add(new Mono("Kiko", 2));
        zoologico.add(new Mono("Coco", 4));
        zoologico.add(new Mono("Bongo", 5));
        zoologico.add(new Aguila("Aquila", 7));
        zoologico.add(new Aguila("Fenix", 3));
        zoologico.add(new Aguila("Nube", 6));
        zoologico.add(new Delfin("Azul", 8));
        zoologico.add(new Delfin("Ola", 5));
        zoologico.add(new Tortuga("Lenta", 25));
        zoologico.add(new Tortuga("Verde", 18));
        zoologico.add(new Serpiente("Sombra", 4));

        int opcion;
        do {
            System.out.println("\n========== SIMULADOR DE ZOOLOGICO ==========");
            System.out.println("Animales registrados: " + zoologico.size());
            System.out.println("1. Mostrar todos los animales");
            System.out.println("2. Escuchar a todos los animales");
            System.out.println("3. Alimentar a todos los animales");
            System.out.println("4. Entrenar animales que puedan hacerlo");
            System.out.println("5. Registrar un animal");
            System.out.println("6. Buscar animal por nombre");
            System.out.println("7. Retirar animal del zoologico");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcion: ");

            while (!entrada.hasNextInt()) {
                System.out.print("Ingresa un numero valido: ");
                entrada.next();
            }
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1: mostrarAnimales(zoologico); break;
                case 2:
                    if (zoologico.isEmpty()) System.out.println("No hay animales registrados.");
                    else for (Animal animal : zoologico) animal.emitirSonido();
                    break;
                case 3:
                    if (zoologico.isEmpty()) System.out.println("No hay animales para alimentar.");
                    else for (Animal animal : zoologico) animal.alimentarse();
                    break;
                case 4: entrenarAnimales(zoologico); break;
                case 5: registrarAnimal(zoologico, entrada); break;
                case 6: buscarAnimal(zoologico, entrada); break;
                case 7: retirarAnimal(zoologico, entrada); break;
                case 0: System.out.println("Cerrando el simulador. Hasta pronto."); break;
                default: System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
        entrada.close();
    }

    public static void mostrarAnimales(ArrayList<Animal> zoologico) {
        if (zoologico.isEmpty()) {
            System.out.println("No hay animales registrados.");
            return;
        }
        System.out.println("\n--- ANIMALES DEL ZOOLOGICO ---");
        for (Animal animal : zoologico) animal.presentarse();
    }

    // Recorre la coleccion y entrena solamente a los animales que implementan Entrenable.
    public static void entrenarAnimales(ArrayList<Animal> zoologico) {
        if (zoologico.isEmpty()) {
            System.out.println("No hay animales registrados.");
            return;
        }

        boolean hayEntrenables = false;
        for (Animal animal : zoologico) {
            if (animal instanceof Entrenable) {
                ((Entrenable) animal).entrenar();
                hayEntrenables = true;
            }
        }

        if (!hayEntrenables) {
            System.out.println("No hay animales que puedan realizar entrenamiento.");
        }
    }

    public static void registrarAnimal(ArrayList<Animal> zoologico, Scanner entrada) {
        System.out.println("\n1.Leon 2.Elefante 3.Jirafa 4.Mono");
        System.out.println("5.Aguila 6.Delfin 7.Tortuga 8.Serpiente");
        System.out.print("Selecciona especie: ");
        if (!entrada.hasNextInt()) {
            System.out.println("Opcion no valida.");
            entrada.nextLine();
            return;
        }
        int tipo = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
            return;
        }
        System.out.print("Edad: ");
        if (!entrada.hasNextInt()) {
            System.out.println("La edad debe ser un numero entero.");
            entrada.nextLine();
            return;
        }
        int edad = entrada.nextInt();
        entrada.nextLine();
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
            return;
        }

        Animal nuevo;
        switch (tipo) {
            case 1: nuevo = new Leon(nombre, edad); break;
            case 2: nuevo = new Elefante(nombre, edad); break;
            case 3: nuevo = new Jirafa(nombre, edad); break;
            case 4: nuevo = new Mono(nombre, edad); break;
            case 5: nuevo = new Aguila(nombre, edad); break;
            case 6: nuevo = new Delfin(nombre, edad); break;
            case 7: nuevo = new Tortuga(nombre, edad); break;
            case 8: nuevo = new Serpiente(nombre, edad); break;
            default: System.out.println("Especie no valida."); return;
        }
        zoologico.add(nuevo);
        System.out.println("Animal registrado correctamente.");
    }

    public static void buscarAnimal(ArrayList<Animal> zoologico, Scanner entrada) {
        System.out.print("Nombre que deseas buscar: ");
        String nombre = entrada.nextLine().trim();
        boolean encontrado = false;
        for (Animal animal : zoologico) {
            if (animal.getNombre().equalsIgnoreCase(nombre)) {
                animal.presentarse();
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontro un animal con ese nombre.");
    }

    public static void retirarAnimal(ArrayList<Animal> zoologico, Scanner entrada) {
        System.out.print("Nombre del animal que deseas retirar: ");
        String nombre = entrada.nextLine().trim();
        for (int i = 0; i < zoologico.size(); i++) {
            if (zoologico.get(i).getNombre().equalsIgnoreCase(nombre)) {
                Animal retirado = zoologico.remove(i);
                System.out.println(retirado.getNombre() + " fue retirado del zoologico.");
                return;
            }
        }
        System.out.println("No se encontro un animal con ese nombre.");
    }
}
