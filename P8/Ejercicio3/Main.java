void main(){
    // Se crean los personajes usando el constructor general de cada clase
    Mago mago = new Mago("Luna", 90, 4, 12, 30);
    Guerrero guerrero = new Guerrero("Ragnar", 120, 10, 18, 12, 5.0);
    Villano villano = new Villano("Sombra", 150, 8, 16, true);
    Aldeano aldeano = new Aldeano("Tomas", 60, 3, 2, "Herrero");

    // Se almacenan distintos tipos de personajes en un arreglo común
    Personaje[] personajes = {mago, guerrero, villano, aldeano};

    System.out.println("========== PERSONAJES ==========");
    for (Personaje personaje : personajes) {
        System.out.println();
        System.out.println(personaje);
    }

    // Inicio sencillo de la aventura
    System.out.println("\n========== AVENTURA ==========");
    aldeano.caminar();
    aldeano.comerciar();
    guerrero.caminar();

    // Combate básico por turnos
    System.out.println("\n========== COMBATE ==========");
    mago.lanzarHechizo(villano);
    guerrero.ataquePoderoso(villano);
    villano.hacerDanio(guerrero);
    villano.invocarEbirros();

    // Estado final de los personajes que participaron en el combate
    System.out.println("\n========== ESTADO FINAL ==========");
    System.out.println(villano);
    System.out.println();
    System.out.println(guerrero);
}