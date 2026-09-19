package com.jcaa.udec.proveedores.domain.core.exception;

public class ProveedorYaExisteException extends RuntimeException {
    private static final String MENSAJE_ERROR = "El proveedor ya existe.";

    public ProveedorYaExisteException() {
        super(MENSAJE_ERROR);
    }
}
