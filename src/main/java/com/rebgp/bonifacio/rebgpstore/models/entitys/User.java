package com.rebgp.bonifacio.rebgpstore.models.entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
@PrimaryKeyJoinColumn(referencedColumnName = "id_people")
public class User extends Persona implements Serializable{
    @NotEmpty
    @Size(max = 500,min = 1)
    private String username;

    @NotEmpty
    @Email
    private String email;


    @NotEmpty
    @Size(max=32,min = 8)
    private String password;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Venta> ventas;

    public User() {
    }



    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    private static final long serialVersionUID = 3L;
}