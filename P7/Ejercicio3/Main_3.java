void main() {
    /*
     * El arreglo es de tipo Empleado.
     *
     * Como todas estas clases heredan de Empleado,
     * podemos guardar objetos diferentes dentro
     * del mismo arreglo.
     */
    Empleado[] empleados = new Empleado[8];


    // =========================
    // CREACIÓN DE LOS EMPLEADOS
    // =========================

    empleados[0] = new CEO(
            "Carlos",
            80000,
            15,
            "Constructora MX"
    );


    empleados[1] = new Gerente(
            "Fernando",
            45000,
            10,
            "Construccion"
    );


    empleados[2] = new Subgerente(
            "Ana",
            30000,
            7,
            "Operaciones"
    );


    empleados[3] = new Ingeniero(
            "Luis",
            35000,
            5,
            "Ingenieria Civil",
            123456,
            "ACI"
    );


    empleados[4] = new Arquitecto(
            "Sofia",
            34000,
            6,
            654321,
            "Moderno"
    );


    empleados[5] = new Obrero(
            "Pedro",
            15000,
            4,
            "Construccion"
    );


    empleados[6] = new Operario(
            "Miguel",
            17000,
            3,
            "Produccion",
            "Excavadora"
    );


    empleados[7] = new RRHH(
            "Laura",
            25000,
            8,
            "Contratacion"
    );


    // =========================
    // ORGANIZACIÓN DE LA EMPRESA
    // =========================


    /*
     * empleados[0] está declarado como Empleado,
     * pero el objeto realmente es un CEO.
     *
     * Por eso hacemos casting.
     */
    CEO ceo = (CEO) empleados[0];


    // El CEO gestiona al Ingeniero
    ceo.agregarIngeniero(
            (Ingeniero) empleados[3]
    );


    // El CEO gestiona al Arquitecto
    ceo.agregarArquitecto(
            (Arquitecto) empleados[4]
    );


    /*
     * Recuperamos al Subgerente mediante casting.
     */
    Subgerente subgerente =
            (Subgerente) empleados[2];


    // El Subgerente administra al Obrero
    subgerente.agregarObrero(
            (Obrero) empleados[5]
    );


    /*
     * También podemos agregar un Operario.
     *
     * Esto funciona porque:
     *
     * Operario extends Obrero
     */
    subgerente.agregarObrero(
            (Operario) empleados[6]
    );


    // =========================
    // MOSTRAR LOS EMPLEADOS
    // =========================

    for (Empleado e : empleados) {

        System.out.println(
                "\n================================"
        );


        /*
         * Aunque "e" sea una referencia Empleado,
         * Java ejecutará el toString correspondiente
         * al objeto real.
         */
        System.out.println(e);


        // =========================
        // CEO
        // =========================

        if (e instanceof CEO) {

            CEO c = (CEO) e;

            System.out.println(
                    "\n-> Gestiona Arquitectos e Ingenieros"
            );
        }


        // =========================
        // SUBGERENTE
        // =========================

        if (e instanceof Subgerente) {

            Subgerente s = (Subgerente) e;

            System.out.println(
                    "\n-> Gestiona Obreros y Operarios"
            );
        }


        // =========================
        // OPERARIO
        // =========================

        if (e instanceof Operario) {

            /*
             * Se realiza casting para poder utilizar
             * un método específico de Operario.
             */
            Operario o = (Operario) e;

            System.out.println(
                    "\n-> Maquina asignada: "
                            + o.getMaquina()
            );
        }
    }


    System.out.println(
            "\n================================"
    );
}
