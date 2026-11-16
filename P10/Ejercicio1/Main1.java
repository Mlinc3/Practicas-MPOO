void main(){
    // Se crean objetos de distintas subclases usando referencias Poligono.
    Poligono[] figuras = new Poligono[2];

    figuras[0] = new Circulo(7.7);
    figuras[1] = new Triangulo(8.0, 5.0);

    // Se calcula el área de cada figura mediante polimorfismo.
    System.out.println("--- Areas de las figuras ---");

    System.out.printf("Area del circulo: %.2f%n", figuras[0].calcularArea());
    System.out.printf("Area del triangulo: %.2f%n", figuras[1].calcularArea());
}