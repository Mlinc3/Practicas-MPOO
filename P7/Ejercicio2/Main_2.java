void main(){
    Automovil auto = new Automovil(
            "Nissan", "Versa", 2024,
            280000, 4, "Gasolina"
    );

    Motocicleta moto = new Motocicleta(
            "Kawasaki", "Versys", 2023,
            185000, 650, true
    );

    Camion camion = new Camion(
            "Freightliner", "M2", 2022,
            1250000, 12.5, 3
    );

    //Imprimps el toString
    System.out.println(auto.toString());
    System.out.println(moto.toString());
    System.out.println(camion.toString());

}