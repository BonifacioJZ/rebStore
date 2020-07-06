package com.rebgp.bonifacio.rebgpstore.models.entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")
@PrimaryKeyJoinColumn(referencedColumnName = "id_people")
public class User extends Persona implements Serializable{
    @NotEmpty
    @Min(value = 1)
    @Max(value = 32)
    private String username;

    @NotEmpty
    @Email
    private String email;


    @NotEmpty
    @Min(value = 8)
    @Max(value = 32)
    private String password;


    public User() {
    }

    
    public User(String username, String email, String password) {
        super();
        this.username = username;
        this.email = email;
        this.password = password;
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