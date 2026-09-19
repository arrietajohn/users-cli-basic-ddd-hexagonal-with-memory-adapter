package com.jcaa.udec.proveedores.domain.core.valueobject;

import com.jcaa.udec.proveedores.domain.core.exception.ProveedorInvalidoException;
import java.util.Objects;

public record ProveedorId(String valor) {
    public ProveedorId {
        if (Objects.isNull(valor) || valor.isBlank() || !esNumeroEntero(valor)) {
            throw new ProveedorInvalidoException();
        }
    }

    private static boolean esNumeroEntero(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException exception) {
            return false;
        }
    }
}
