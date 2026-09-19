package com.jcaa.udec.proveedores.domain.core.valueobject;

import com.jcaa.udec.proveedores.domain.core.exception.ProveedorInvalidoException;
import java.util.Objects;

public record NombreProveedor(String valor) {
    private static final int LONGITUD_MINIMA = 3;

    public NombreProveedor {
        if (Objects.isNull(valor) || valor.isBlank() || valor.length() < LONGITUD_MINIMA) {
            throw new ProveedorInvalidoException();
        }
    }
}
