public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos", 19, 8.5, 120);

        System.out.println("ESTUDIANTE INICIAL");
        System.out.println(estudiante);

        estudiante.setNombre("Mario");
        estudiante.setEdad(20);
        estudiante.setPromedio(9.2);
        estudiante.setCreditos(150);

        System.out.println("\nESTUDIANTE ACTUALIZADO");
        System.out.println(estudiante);

        estudiante.setNombre("");
        estudiante.setEdad(10);
        estudiante.setPromedio(11);
        estudiante.setCreditos(-30);

        System.out.println("\nRESULTADO FINAL");
        System.out.println(estudiante);
    }
}
