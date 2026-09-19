package com.jcaa.udec.proveedores.domain.core.exception;

public class ProveedorInvalidoException extends RuntimeException {
    private static final String MENSAJE_ERROR = "Los datos del proveedor son invalidos.";

    public ProveedorInvalidoException() {
        super(MENSAJE_ERROR);
    }
}
