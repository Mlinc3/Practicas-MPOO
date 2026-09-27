

package commpoo.p4e2;
import java.util.Scanner;


public class P4E2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int TOTAL_ALUMNOS = 20;
        final double CALIFICACION_MINIMA = 6.0;
        
        double[] calificaciones = new double[TOTAL_ALUMNOS];
        double suma = 0;
        int aprobados = 0;

        System.out.println("=== Ingrese las 20 calificaciones (0 a 10) ===");
        for (int i = 0; i < TOTAL_ALUMNOS; i++) {
            do {
                System.out.print("Calificación del alumno " + (i + 1) + ": ");
                calificaciones[i] = sc.nextDouble();
                if (calificaciones[i] < 0 || calificaciones[i] > 10) {
                    System.out.println("Error: Ingrese un valor entre 0 y 10.");
                }
            } while (calificaciones[i] < 0 || calificaciones[i] > 10);
        }

        double maximo = calificaciones[0];
        double minimo = calificaciones[0];

        for (int i = 0; i < TOTAL_ALUMNOS; i++) {
            suma += calificaciones[i];
            if (calificaciones[i] > maximo) {
                maximo = calificaciones[i];
            }
            if (calificaciones[i] < minimo) {
                minimo = calificaciones[i];
            }
            if (calificaciones[i] >= CALIFICACION_MINIMA) {
                aprobados++;
            }
        }

        double promedio = suma / TOTAL_ALUMNOS;

        System.out.println("Reporte de Calificaciones");
        System.out.printf("Promedio general: %.2f%n", promedio);
        System.out.println("Calificación máxima: " + maximo);
        System.out.println("Calificación mínima: " + minimo);
        System.out.println("Alumnos aprobados: " + aprobados + " de " + TOTAL_ALUMNOS);

        sc.close();
    }
}



