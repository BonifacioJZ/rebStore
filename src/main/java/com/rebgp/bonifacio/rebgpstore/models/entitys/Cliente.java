package com.rebgp.bonifacio.rebgpstore.models.entitys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clients")
@PrimaryKeyJoinColumn(referencedColumnName = "id_people")
public class Cliente extends Persona implements Serializable {
    
    @Column(name = "city")
    @NotEmpty
    @Size(max = 500,min = 1)
    private String Lugar;


    @OneToMany(mappedBy = "cliente",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Venta> ventas; 

    
    @JoinTable(name = "number_client",
    joinColumns =@JoinColumn(name="id_people",nullable = true),
    inverseJoinColumns = @JoinColumn(name="number_id",nullable = true))
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Number> numbers;

    public Cliente() {
        super();
        ventas = new ArrayList<Venta>();
    }



    public List<Number> getNumbers() {
        return this.numbers;
    }

    public void setNumbers(List<Number> numbers) {
        this.numbers = numbers;
    }


    public void addVentas(Venta venta){
        ventas.add(venta);
    }

    public List<Venta> getVentas() {
        return this.ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Cliente(String Lugar) {
        this.Lugar = Lugar;
    }


    public String getLugar() {
        return this.Lugar;
    }

    public void setLugar(String Lugar) {
        this.Lugar = Lugar;
    }
    


    private static final long serialVersionUID = 3L;
}