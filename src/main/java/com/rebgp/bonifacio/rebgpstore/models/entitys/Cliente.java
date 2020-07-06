package com.rebgp.bonifacio.rebgpstore.models.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "clients")
@PrimaryKeyJoinColumn(referencedColumnName = "id_people")
public class Cliente extends Persona implements Serializable {
    
    @Column(name = "city")
    @NotEmpty
    @Min(value = 1)
    @Max(value = 500)
    private String Lugar;



    public Cliente() {
        super();
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