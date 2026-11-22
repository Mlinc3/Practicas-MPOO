package tienda.seguridad;

import at.favre.lib.crypto.bcrypt.BCrypt;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.HexFormat;

public final class HashContrasena {

    private static final int COSTO = 12;
    private final byte[] pimienta;

    public HashContrasena(String pimienta) {
        if (pimienta == null || pimienta.isBlank()) {
            throw new IllegalArgumentException("La pimienta no puede estar vacía");
        }
        this.pimienta = pimienta.getBytes(StandardCharsets.UTF_8);
    }

    public String cifrar(String contrasena) {
        return BCrypt.withDefaults().hashToString(COSTO, preparar(contrasena));
    }

    public boolean verificar(String contrasena, String hash) {
        return BCrypt.verifyer()
                .verify(preparar(contrasena), hash.toCharArray())
                .verified;
    }

    private char[] preparar(String contrasena) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(pimienta, "HmacSHA256"));
            byte[] digest = mac.doFinal(contrasena.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(digest).toCharArray();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("No se pudo preparar la contraseña", e);
        }
    }
}