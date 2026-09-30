import java.time.LocalDate;
import java.time.DayOfWeek;
public class Boleto {

    int edad;
    double precio;

    public Boleto(int edad, double precio){
        this.edad= edad;
        this.precio = precio;

    }

    public double calcularPrecioFinal() {

        if(edad < 0 ){
            return -1;
        }
        if(edad < 12){
            precio = precio*0.50;
        }else if(edad > 60){
            precio = precio*0.40;
        }
        return precio;
    }

    public void imprimirPrecio(){
        System.out.println("Su descuento es de: " + precio);
    }


}
