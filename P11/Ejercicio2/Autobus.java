
public class Autobus extends Transporte{
	
	Autobus(double km, double combustible){
		this.km=km;
		this.combustible=combustible;
	}
	
	@Override
	public double Combustible() {
		return km*(combustible*0.2);
	}
}
