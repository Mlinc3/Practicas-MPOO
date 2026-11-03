public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;
    private int creditos;

    public Estudiante(String nombre, int edad, double promedio, int creditos) {
        setNombre(nombre);
        setEdad(edad);
        setPromedio(promedio);
        setCreditos(creditos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 15 && edad <= 99) {
            this.edad = edad;
        } else {
            System.out.println("Error: la edad debe estar entre 15 y 99.");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: el promedio debe estar entre 0 y 10.");
        }
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        if (creditos >= 0 && creditos <= 400) {
            this.creditos = creditos;
        } else {
            System.out.println("Error: los créditos deben estar entre 0 y 400.");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nPromedio: " + promedio + "\nCréditos: " + creditos;
    }
}
