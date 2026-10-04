import java.util.Date;
import java.util.Calendar;

public class Cliente {

    // Atributos
    String nombre;
    Membresia membresia;
    Date fechaCumpleanios;


    // Constructor
    public Cliente(String nombre,
                   Membresia membresia,
                   Date fechaCumpleanios) {

        this.nombre = nombre;
        this.membresia = membresia;
        this.fechaCumpleanios = fechaCumpleanios;
    }


    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public Membresia getMembresia() {
        return membresia;
    }


    // Método para verificar si es cumpleaños
    public boolean esCumpleanios(Date fechaActual) {

        Calendar cumpleanios = Calendar.getInstance();
        Calendar actual = Calendar.getInstance();

        cumpleanios.setTime(fechaCumpleanios);
        actual.setTime(fechaActual);

        int diaCumpleanios =
                cumpleanios.get(Calendar.DAY_OF_MONTH);

        int mesCumpleanios =
                cumpleanios.get(Calendar.MONTH);

        int diaActual =
                actual.get(Calendar.DAY_OF_MONTH);

        int mesActual =
                actual.get(Calendar.MONTH);

        return diaCumpleanios == diaActual &&
                mesCumpleanios == mesActual;
    }


    public void mostrarDatos() {

        System.out.println("Cliente: " + nombre);
        System.out.println("Membresia: " + membresia);
    }
}