package com.jcaa.udec.proveedores.domain.core.exception;

public class ProveedorNoExisteException extends RuntimeException {
    private static final String MENSAJE_ERROR = "El proveedor no existe.";

    public ProveedorNoExisteException() {
        super(MENSAJE_ERROR);
    }
}
