package com.jcaa.udec.proveedores.domain.core.valueobject;

import com.jcaa.udec.proveedores.domain.core.exception.ProveedorInvalidoException;
import java.util.Objects;

public record Nit(String valor) {
    private static final int LONGITUD_MINIMA = 6;
    private static final int LONGITUD_MAXIMA = 15;

    public Nit {
        if (!esValido(valor)) {
            throw new ProveedorInvalidoException();
        }
    }

    private static boolean esValido(String valor) {
        if (Objects.isNull(valor) || valor.isBlank()) {
            return false;
        }
        if (valor.length() < LONGITUD_MINIMA || valor.length() > LONGITUD_MAXIMA) {
            return false;
        }
        for (int indice = 0; indice < valor.length(); indice++) {
            char caracter = valor.charAt(indice);
            if (!Character.isDigit(caracter) && caracter != '-') {
                return false;
            }
        }
        return true;
    }
}
