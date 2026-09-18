package com.jcaa.udec.collections.adapter.persistence.memory;

import com.jcaa.udec.collections.domain.core.model.Proyecto;

import java.util.LinkedHashMap;
import java.util.Map;

final class ProyectosNoSqlMemoria {

    private static final Map<String, Proyecto> PROYECTOS =
            new LinkedHashMap<>();

    private ProyectosNoSqlMemoria() {
    }

    static Map<String, Proyecto> obtenerProyectos() {
        return PROYECTOS;
    }
}