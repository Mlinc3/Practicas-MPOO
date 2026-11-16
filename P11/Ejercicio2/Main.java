import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Transporte com;
		int op;
		double km, carga, combustible;
		do {
			System.out.println("¿De qué medio de transporte quiere calcular su consumo de combustible? ");
			System.out.println("1) Automovil");
			System.out.println("2) Autobus");
			System.out.println("3) Camion de Carga");
			System.out.println("4) Salir");
			op=read.nextInt();
			switch(op) {
			case 1:
				do{
					System.out.println("¿Cuánto combustible le quiere poner al automovil?");
					combustible=read.nextDouble();
						if(combustible<0 || combustible>70) {
							System.out.println("El combustible no puede ser negativo ni mayor a 70");
						}
					}while(combustible<0 || combustible>70);
				do {
					System.out.println("¿Cuántós kilómetros va a recorrer?");
					km=read.nextDouble();
					if(km<0) {
						System.out.println("No puede recorrer una distancia negativa");
					}
				}while(km<0);
				com = new Automovil(km, combustible);
				System.out.println("Se consumirá " + com.Combustible() + " en " + km + " kilómetros");
				break;
			case 2:
				do{
					System.out.println("¿Cuánto combustible le quiere poner al autobus?");
					combustible=read.nextDouble();
						if(combustible<0 || combustible>200) {
							System.out.println("El combustible no puede ser negativo ni mayor a 200");
						}
					}while(combustible<0 || combustible>200);
				do {
					System.out.println("¿Cuántós kilómetros va a recorrer?");
					km=read.nextDouble();
					if(km<0) {
						System.out.println("No puede recorrer una distancia negativa");
					}
				}while(km<0);
				com = new Autobus(km, combustible);
				System.out.println("Se consumirá " + com.Combustible() + " en " + km + " kilómetros");
				break;
			case 3:
				do{
					System.out.println("¿Cuánto combustible le quiere poner al camión de carga?");
					combustible=read.nextDouble();
						if(combustible<0 || combustible>300) {
							System.out.println("El combustible no puede ser negativo ni mayor a 300");
						}
					}while(combustible<0 || combustible>300);
				do {
					System.out.println("¿Cuántós kilómetros va a recorrer?");
					km=read.nextDouble();
					if(km<0) {
						System.out.println("No puede recorrer una distancia negativa");
					}
				}while(km<0);
					do{
						System.out.println("¿De cuánto es la carga que lleva el camión de carga?");
						carga=read.nextDouble();
						if (carga<0) System.out.println("La carga no puede ser negativa");
					}while(carga<0);
				com = new CamionDeCarga(carga, km, combustible);
				System.out.println("Se consumirá " + com.Combustible() + " en " + km + " kilómetros");
				break;
			case 4:
				System.out.println("Saliendo del sistema");
				break;
			default:
				System.out.println("Opción inválida, escoja de nuevo");
				op=read.nextInt();
				break;
			}
		}while(op!=4);
		
		read.close();
	}

}
