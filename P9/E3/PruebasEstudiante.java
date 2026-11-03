public class PruebasEstudiante {
    static int total = 0;
    static int aprobadas = 0;

    static void verificar(String descripcion, boolean condicion) {
        total++;
        if (condicion) {
            aprobadas++;
            System.out.println("OK    " + descripcion);
        } else {
            System.out.println("FALLO " + descripcion);
        }
    }

    public static void main(String[] args) {
        Estudiante e = new Estudiante("Ana", 20, 8.0, 100);

        e.setEdad(15);
        verificar("edad 15 (limite inferior) se acepta", e.getEdad() == 15);
        e.setEdad(99);
        verificar("edad 99 (limite superior) se acepta", e.getEdad() == 99);
        e.setEdad(14);
        verificar("edad 14 se rechaza", e.getEdad() == 99);
        e.setEdad(100);
        verificar("edad 100 se rechaza", e.getEdad() == 99);

        e.setPromedio(0);
        verificar("promedio 0 (limite inferior) se acepta", e.getPromedio() == 0);
        e.setPromedio(10);
        verificar("promedio 10 (limite superior) se acepta", e.getPromedio() == 10);
        e.setPromedio(-0.1);
        verificar("promedio -0.1 se rechaza", e.getPromedio() == 10);
        e.setPromedio(10.1);
        verificar("promedio 10.1 se rechaza", e.getPromedio() == 10);

        e.setCreditos(0);
        verificar("creditos 0 (limite inferior) se acepta", e.getCreditos() == 0);
        e.setCreditos(400);
        verificar("creditos 400 (limite superior) se acepta", e.getCreditos() == 400);
        e.setCreditos(-1);
        verificar("creditos -1 se rechaza", e.getCreditos() == 400);
        e.setCreditos(401);
        verificar("creditos 401 se rechaza", e.getCreditos() == 400);

        e.setNombre("Luis");
        verificar("nombre valido se acepta", e.getNombre().equals("Luis"));
        e.setNombre("");
        verificar("nombre vacio se rechaza", e.getNombre().equals("Luis"));
        e.setNombre("   ");
        verificar("nombre con solo espacios se rechaza", e.getNombre().equals("Luis"));
        e.setNombre(null);
        verificar("nombre null se rechaza", e.getNombre().equals("Luis"));

        Estudiante invalido = new Estudiante("", 5, 12, -1);
        verificar("constructor con datos invalidos no guarda edad 5", invalido.getEdad() != 5);
        verificar("constructor con datos invalidos no guarda promedio 12", invalido.getPromedio() != 12);
        verificar("constructor con datos invalidos no guarda creditos -1", invalido.getCreditos() != -1);

        System.out.println("\nRESULTADO: " + aprobadas + " de " + total + " pruebas aprobadas");
    }
}
