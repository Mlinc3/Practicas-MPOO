
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Enumeration;
import java.util.Scanner;

public class StreamFlix {


    // --------------------------------------------------
    // PARTE 1
    // Mostrar playlist utilizando for clásico
    // --------------------------------------------------

    static void mostrarPlaylist(
            ArrayList<Musica> playlist,
            Hashtable<String, Integer> duraciones) {

        int duracionTotal = 0;

        for (int i = 0; i < playlist.size(); i++) {

            // Se obtiene la canción de la posición i
            Musica cancion = playlist.get(i);

            // Se obtiene su título
            String titulo = cancion.getTitulo();

            // Se busca la duración mediante el título
            int duracion = duraciones.get(titulo);

            // Se acumula la duración
            duracionTotal = duracionTotal + duracion;

            // Se muestra la canción
            System.out.println(
                    (i + 1) + ". " +
                            titulo + " (" +
                            formato(duracion) + ")"
            );
        }

        System.out.println(
                "Duracion total: " +
                        formato(duracionTotal)
        );
    }


    // --------------------------------------------------
    // PARTE 2
    // Modo fiesta
    // for-each + continue + break
    // --------------------------------------------------

    static void modoFiesta(
            ArrayList<Musica> playlist,
            Hashtable<String, Integer> duraciones,
            HashSet<String> bloqueadas,
            int segundosDisponibles) {

        int cancionesReproducidas = 0;
        int tiempoUtilizado = 0;


        // Se recorren todas las canciones
        for (Musica cancion : playlist) {

            String titulo = cancion.getTitulo();


            // Se verifica si la canción está bloqueada
            if (bloqueadas.contains(titulo)) {

                System.out.println(
                        "Saltada (control parental): " +
                                titulo
                );

                continue;
            }


            // Se obtiene la duración
            int duracion = duraciones.get(titulo);


            // Se verifica si alcanza el tiempo
            if (tiempoUtilizado + duracion >
                    segundosDisponibles) {

                System.out.println(
                        "Sin tiempo para: " + titulo
                );

                break;
            }


            // Se reproduce la canción
            System.out.println(
                    "Reproduciendo: " + titulo
            );


            // Se suma el tiempo
            tiempoUtilizado =
                    tiempoUtilizado + duracion;


            // Se cuenta la canción
            cancionesReproducidas++;
        }


        // Tiempo restante
        int tiempoSobrante =
                segundosDisponibles - tiempoUtilizado;


        System.out.println();

        System.out.println(
                cancionesReproducidas +
                        " canciones, sobran " +
                        formato(tiempoSobrante)
        );
    }


    // --------------------------------------------------
    // PARTE 3
    // Encontrar canción más larga
    // while + Enumeration
    // --------------------------------------------------

    static void cancionMasLarga(
            Hashtable<String, Integer> duraciones) {

        // Se obtienen todas las claves
        Enumeration<String> canciones =
                duraciones.keys();


        String tituloMasLargo = "";
        int mayorDuracion = 0;


        // Se recorren las claves
        while (canciones.hasMoreElements()) {

            String titulo =
                    canciones.nextElement();

            int duracion =
                    duraciones.get(titulo);


            // Se compara con la mayor encontrada
            if (duracion > mayorDuracion) {

                mayorDuracion = duracion;
                tituloMasLargo = titulo;
            }
        }


        System.out.println(
                "Mas larga: " +
                        tituloMasLargo +
                        " (" +
                        formato(mayorDuracion) +
                        ")"
        );
    }


    // --------------------------------------------------
    // Método proporcionado por la práctica
    // Convierte segundos a minutos:segundos
    // --------------------------------------------------

    static String formato(int seg) {

        return String.format(
                "%d:%02d",
                seg / 60,
                seg % 60
        );
    }
}
