package com.rebgp.bonifacio.rebgpstore.models.entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "services")
public class Service implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    private Long id;

    @Column(name = "name")
    @NotEmpty
    @Size(max=500,min=1)
    private String nombre;

    @NotEmpty
    @Size(max=1000,min=1)
    private String descripcion;

    @NotEmpty
    @Column(name = "price")
    private double precio;

    @NotEmpty
    @Column(name = "comision")
    private double comision;

    @NotEmpty
    @Size(max = 15,min=10)
    private String numero;

    @ManyToOne(fetch = FetchType.LAZY)
    private Tipo tipo;

    public Service() {
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