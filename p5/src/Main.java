import java.util.Date;
import java.util.Calendar;
void main() {


        // Fecha de cumpleaños


        Calendar cumple = Calendar.getInstance();

        cumple.set(
                2006,
                Calendar.OCTOBER,
                10
        );

        Date fechaCumpleanios = cumple.getTime();



        // Fecha de la compra

        Calendar compra = Calendar.getInstance();

        compra.set(
                2026,
                Calendar.OCTOBER,
                6
        );

        Date fechaCompra = compra.getTime();



        // Crear cliente


        Cliente cliente1 = new Cliente(
                "Mario",
                Membresia.ORO,
                fechaCumpleanios
        );



        // Crear compra

        Compra compra1 = new Compra(
                1000,
                fechaCompra,
                cliente1
        );


        // Mostrar resultados

        cliente1.mostrarDatos();
        compra1.mostrarResumen();
}
