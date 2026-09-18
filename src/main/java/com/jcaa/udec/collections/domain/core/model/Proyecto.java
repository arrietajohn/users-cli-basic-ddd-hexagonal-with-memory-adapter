package com.jcaa.udec.collections.domain.core.model;

import com.jcaa.udec.collections.domain.core.exception.ProyectoInvalidoException;

import java.time.LocalDate;

public class Proyecto {

    private final String nombreEnClave;
    private String denominacionComercial;
    private LocalDate fechaInicio;
    private LocalDate fechaFinalizacion;
    private String estado;

    public Proyecto(
            String nombreEnClave,
            String denominacionComercial,
            LocalDate fechaInicio,
            LocalDate fechaFinalizacion,
            String estado) {

        validarTexto(nombreEnClave, "Nombre en clave");
        validarTexto(denominacionComercial, "Denominación comercial");

        if (fechaInicio == null) {
            throw new ProyectoInvalidoException("La fecha de inicio es obligatoria.");
        }

        validarTexto(estado, "Estado");

        this.nombreEnClave = nombreEnClave.trim();
        this.denominacionComercial = denominacionComercial.trim();
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado.trim();
    }

    public void actualizar(
            String denominacionComercial,
            LocalDate fechaInicio,
            LocalDate fechaFinalizacion,
            String estado) {

        validarTexto(denominacionComercial, "Denominación comercial");

        if (fechaInicio == null) {
            throw new ProyectoInvalidoException("La fecha de inicio es obligatoria.");
        }

        validarTexto(estado, "Estado");

        this.denominacionComercial = denominacionComercial.trim();
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estado = estado.trim();
    }

    private static void validarTexto(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new ProyectoInvalidoException(campo + " es obligatorio.");
        }
    }

    public String getNombreEnClave() {
        return nombreEnClave;
    }

    public String getDenominacionComercial() {
        return denominacionComercial;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "nombreEnClave='" + nombreEnClave + '\'' +
                ", denominacionComercial='" + denominacionComercial + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinalizacion=" + fechaFinalizacion +
                ", estado='" + estado + '\'' +
                '}';
    }
}