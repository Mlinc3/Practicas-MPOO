

public class CamionDeCarga extends Transporte{
	private double carga;
	
	CamionDeCarga(double carga, double km, double combustible){
		this.carga=carga;
		this.km=km;
		this.combustible=combustible;
		}
	
	@Override
	public double Combustible() {
		if(carga==0) {
			return km*(combustible*0.1);
		}
		if(carga>=1 && carga<=150) {
			return km*(combustible*0.15);
		}
		else {
			return km*(combustible*0.20);
		}
	}
}
