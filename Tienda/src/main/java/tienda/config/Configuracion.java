package tienda.config;

import io.github.cdimascio.dotenv.Dotenv;

public final class Configuracion {

    private static final Dotenv ENV = Dotenv.configure().ignoreIfMissing().load();

    private Configuracion() {}

    public static String obtener(String clave, String porDefecto) {
        String valor = ENV.get(clave);
        return (valor == null || valor.isBlank()) ? porDefecto : valor;
    }

    public static String obtenerObligatoria(String clave) {
        String valor = ENV.get(clave);
        if (valor == null || valor.isBlank()) {
            throw new IllegalStateException("Falta la variable " + clave + " en .env");
        }
        return valor;
    }
}