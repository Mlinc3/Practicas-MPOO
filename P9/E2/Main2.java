void main(){
    // Crear una cuenta
    Cuenta cuenta = new Cuenta("Carlos", 1500);

    System.out.println("CUENTA INICIAL");
    System.out.println(cuenta);

    // Modificar los atributos mediante setters
    cuenta.setTitular("Mario");
    cuenta.setSaldo(2500);

    System.out.println("\nCUENTA ACTUALIZADA");
    System.out.println(cuenta);

    // Intentar introducir valores incorrectos
    cuenta.setSaldo(-500);
    cuenta.setTitular("");

    System.out.println("\nRESULTADO FINAL");
    System.out.println(cuenta);
}
