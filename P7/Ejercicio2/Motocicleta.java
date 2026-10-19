class Motocicleta extends Vehiculo {

    private int cilindrada;
    private boolean tieneMaletero;

    public Motocicleta(String marca, String modelo, int anio, double precio,
                       int cilindrada, boolean tieneMaletero) {

        super(marca, modelo, anio, precio);

        this.cilindrada = cilindrada;
        this.tieneMaletero = tieneMaletero;
    }

    @Override
    public String toString() {
        return super.toString()
                + " || Tipo: Motocicleta"
                + " || Cilindrada: " + cilindrada + " cc"
                + " || Tiene maletero: "
                + (tieneMaletero ? "Si" : "No");
    }
}
