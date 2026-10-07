import java.util.ArrayList;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Scanner;

public class MainSrtream {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaración de las colecciones
        ArrayList<Musica> playlist = new ArrayList<Musica>();

        Hashtable<String, Integer> duraciones =
                new Hashtable<String, Integer>();

        HashSet<String> bloqueadas =
                new HashSet<String>();


        // Creación de las canciones
        Musica musica1 = new Musica(
                "Intro Lo-Fi", 95, false
        );

        Musica musica2 = new Musica(
                "Neon Drive", 210, false
        );

        Musica musica3 = new Musica(
                "Boss Battle Theme", 185, false
        );

        Musica musica4 = new Musica(
                "Explicit Remix", 200, true
        );

        Musica musica5 = new Musica(
                "Pixel Love", 170, false
        );

        Musica musica6 = new Musica(
                "Final Credits", 240, false
        );


        // Se agregan las canciones a la playlist
        playlist.add(musica1);
        playlist.add(musica2);
        playlist.add(musica3);
        playlist.add(musica4);
        playlist.add(musica5);
        playlist.add(musica6);


        // Se llena el Hashtable con título y duración
        for (Musica cancion : playlist) {

            duraciones.put(
                    cancion.getTitulo(),
                    cancion.getDuracion()
            );
        }


        // Se agregan al HashSet las canciones bloqueadas
        for (Musica cancion : playlist) {

            if (cancion.getBloqueada()) {

                bloqueadas.add(
                        cancion.getTitulo()
                );
            }
        }


        // Menú principal
        int opcion;

        do {

            System.out.println("\n--- STREAMFLIX ---");
            System.out.println("1) Ver playlist");
            System.out.println("2) Modo fiesta");
            System.out.println("3) Mas larga");
            System.out.println("0) Salir");

            System.out.print("Opcion: ");
            opcion = sc.nextInt();


            switch (opcion) {

                case 1:

                    StreamFlix.mostrarPlaylist(
                            playlist,
                            duraciones
                    );

                    break;


                case 2:

                    System.out.print(
                            "Minutos disponibles: "
                    );

                    int minutos = sc.nextInt();

                    int segundosDisponibles =
                            minutos * 60;

                    StreamFlix.modoFiesta(
                            playlist,
                            duraciones,
                            bloqueadas,
                            segundosDisponibles
                    );

                    break;


                case 3:

                    StreamFlix.cancionMasLarga(
                            duraciones
                    );

                    break;


                case 0:

                    System.out.println(
                            "Hasta pronto!"
                    );

                    break;


                default:

                    System.out.println(
                            "Opcion no valida."
                    );
            }

        } while (opcion != 0);


        sc.close();
    }
}