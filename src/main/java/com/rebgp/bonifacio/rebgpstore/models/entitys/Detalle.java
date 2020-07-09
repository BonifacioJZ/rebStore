package com.rebgp.bonifacio.rebgpstore.models.entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "details")
public class Detalle implements Serializable{


    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private int cantidad;

    @NotEmpty
    private double precio;

    @NotEmpty
    private double subtotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_id")
    private Service service;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return this.subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void addPrecio(Service service){
        setPrecio(service.getPrecio());
    }

    public double subtotal(){
        return getPrecio() * getCantidad();
    }


    private static final long serialVersionUID = 3L;
    
}