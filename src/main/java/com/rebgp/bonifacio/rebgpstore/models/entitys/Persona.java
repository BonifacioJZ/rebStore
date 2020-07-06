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
@Table(name = "peoples")
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_people")
    private Long id;

    @Column(name = "name")
    @NotEmpty
    @Min(value = 1)
    @Max(value = 500)
    private String  nombre;

    @Column(name="last_name")
    @NotEmpty
    @Min(value = 1)
    @Max(value = 500)
    private String apellidos;


    public Persona() {
    }


    public Persona(final Long id, final String nombre, final String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(final String apellidos) {
        this.apellidos = apellidos;
    }
    
    private static  final long serialVersionUID = 2L;
    
}