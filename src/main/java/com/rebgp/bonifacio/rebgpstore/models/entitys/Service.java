package com.rebgp.bonifacio.rebgpstore.models.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "services")
public class Service implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long id;

    @Column(name = "name")
    @NotEmpty
    @Min(value = 1)
    @Max(value = 1000)
    private String nombre;

    @NotEmpty
    @Max(value = 10000)
    @Min(value = 1)
    private String descripcion;

    @NotEmpty
    @Column(name = "price")
    private double precio;

    @NotEmpty
    @Column(name = "comision")
    private double comision;

    @NotEmpty
    @Max(value = 15)
    @Min(value = 10)
    private String numero;

    public Service() {
    }


    public Service(Long id, String nombre, String descripcion, double precio, double comision, String numero) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.comision = comision;
        this.numero = numero;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getComision() {
        return this.comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }




    private static final long serialVersionUID = 3L;
}