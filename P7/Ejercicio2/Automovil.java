class Automovil extends Vehiculo {

    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil(String marca, String modelo, int anio, double precio,
                     int numeroPuertas, String tipoCombustible) {

        super(marca, modelo, anio, precio);

        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return super.toString()
                + " || Tipo: Automovil"
                + " || Numero de puertas: " + numeroPuertas
                + " || Combustible: " + tipoCombustible;
    }
}
