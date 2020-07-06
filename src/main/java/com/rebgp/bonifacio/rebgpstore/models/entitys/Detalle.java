package com.rebgp.bonifacio.rebgpstore.models.entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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


    private static final long serialVersionUID = 3L;
    
}