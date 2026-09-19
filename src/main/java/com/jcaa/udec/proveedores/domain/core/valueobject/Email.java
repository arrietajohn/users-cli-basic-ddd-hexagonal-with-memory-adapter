package com.jcaa.udec.proveedores.domain.core.valueobject;

import com.jcaa.udec.proveedores.domain.core.exception.ProveedorInvalidoException;
import java.util.Objects;

public record Email(String valor) {
    private static final int LONGITUD_MINIMA_USUARIO = 2;
    private static final int LONGITUD_MINIMA_DOMINIO = 5;
    private static final String ARROBA = "@";
    private static final String PUNTO = ".";
    private static final String ESPACIO = " ";

    public Email {
        if (!esValido(valor)) {
            throw new ProveedorInvalidoException();
        }
    }

    private static boolean esValido(String valor) {
        if (Objects.isNull(valor) || valor.isBlank() || valor.contains(ESPACIO)) {
            return false;
        }

        int posicionArroba = valor.indexOf(ARROBA);
        int ultimaPosicionArroba = valor.lastIndexOf(ARROBA);
        if (posicionArroba <= 0
                || posicionArroba != ultimaPosicionArroba
                || posicionArroba == valor.length() - 1) {
            return false;
        }

        String usuario = valor.substring(0, posicionArroba);
        String dominio = valor.substring(posicionArroba + 1);
        return usuario.length() >= LONGITUD_MINIMA_USUARIO
                && dominio.length() >= LONGITUD_MINIMA_DOMINIO
                && dominio.contains(PUNTO)
                && esSeccionValida(usuario)
                && esSeccionValida(dominio);
    }

    private static boolean esSeccionValida(String seccion) {
        for (int indice = 0; indice < seccion.length(); indice++) {
            char caracter = seccion.charAt(indice);
            if (!Character.isLetterOrDigit(caracter) && caracter != '.' && caracter != '_') {
                return false;
            }
        }
        return true;
    }
}
