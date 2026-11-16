

public class Automovil extends Transporte{
	
	Automovil(double km, double combustible){
		this.km=km;
		this.combustible=combustible;
	}
	
	@Override
	public double Combustible() {
		return km*(combustible*0.1);
	}
}
