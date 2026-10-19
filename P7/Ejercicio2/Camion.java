class Camion extends Vehiculo {

    private double capacidadCarga;
    private int numeroEjes;

    public Camion(String marca, String modelo, int anio, double precio,
                  double capacidadCarga, int numeroEjes) {

        super(marca, modelo, anio, precio);

        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return super.toString()
                + " || Tipo: Camion"
                + " || Capacidad de carga: " + capacidadCarga + " toneladas"
                + " || Numero de ejes: " + numeroEjes;
    }
}