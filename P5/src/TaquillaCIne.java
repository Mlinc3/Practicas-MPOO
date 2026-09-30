import java.util.Scanner;
public class TaquillaCIne {
    public static void main(String[] args){
        Sala s1 = Sala.TRADICIONAL;

        switch (s1){
            case TRADICIONAL:
                System.out.println("Su boleto le cuesta $80");
                break;
            case TRES_D:
                System.out.println("Su boleto cuesta $110");
            case VIP:
                System.out.println("Su boleto cuesta $160");
        }

        Boleto boleto = new Boleto(61, 80);
        boleto.calcularPrecioFinal();
        boleto.imprimirPrecio();

    }
}
