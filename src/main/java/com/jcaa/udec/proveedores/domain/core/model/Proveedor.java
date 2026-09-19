package com.jcaa.udec.proveedores.domain.core.model;

import com.jcaa.udec.proveedores.domain.core.valueobject.Email;
import com.jcaa.udec.proveedores.domain.core.valueobject.Nit;
import com.jcaa.udec.proveedores.domain.core.valueobject.NombreProveedor;
import com.jcaa.udec.proveedores.domain.core.valueobject.ProveedorId;
import com.jcaa.udec.proveedores.domain.core.valueobject.Telefono;
import lombok.Builder;

public class Proveedor {
    private final ProveedorId id;
    private final Nit nit;
    private final NombreProveedor nombre;
    private final Telefono telefono;
    private final Email email;

    @Builder
    public Proveedor(String id, String nit, String nombre, String telefono, String email) {
        this.id = new ProveedorId(id);
        this.nit = new Nit(nit);
        this.nombre = new NombreProveedor(nombre);
        this.telefono = new Telefono(telefono);
        this.email = new Email(email);
    }

    public String getId() {
        return id.valor();
    }

    public String getNit() {
        return nit.valor();
    }

    public String getNombre() {
        return nombre.valor();
    }

    public String getTelefono() {
        return telefono.valor();
    }

    public String getEmail() {
        return email.valor();
    }
}
