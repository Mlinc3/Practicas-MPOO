void main(){
    // Se crea un arreglo de tipo Empleado con diferentes subclases.
    Empleado[] empleados = new Empleado[3];

    empleados[0] = new Gerente("Ana Perez", 30000.0, 8000.0);
    empleados[1] = new CTO("Mario Estrada", 50000.0, 20000.0);
    empleados[2] = new Ingeniero("Rafael Agreda", 25000.0, 10, 500.0);

    // Se recorren los empleados y se calcula su salario de forma polimorfica.
    System.out.println("--- Calculo de salarios ---");

    for (Empleado emp : empleados) {
        System.out.printf(
                "Empleado: %s | Puesto: %s | Salario total: $%.2f%n",
                emp.getNombre(),
                emp.getClass().getSimpleName(),
                emp.calcularSalario()
        );
    }
}
