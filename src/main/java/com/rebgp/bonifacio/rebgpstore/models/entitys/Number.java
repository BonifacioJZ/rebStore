package com.rebgp.bonifacio.rebgpstore.models.entitys;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "numbers")
public class Number implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number_id")
    private Long id;

    @NotEmpty
    @Size(max = 15,min=10)
    private String numero;

    @ManyToMany(mappedBy = "numbers")
    private List<Cliente> clientes;


    public Number() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private static  final long serialVersionUID = 2L;
}