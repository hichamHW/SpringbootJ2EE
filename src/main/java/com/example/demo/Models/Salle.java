package com.example.demo.Models;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Component
@Entity
public class Salle {


    @Id
    @GeneratedValue
    private  int Id;
    private String NameSalle;

    public Boolean getVide() {
        return Vide;
    }

    public void setVide(Boolean vide) {
        Vide = vide;
    }

    private  Boolean Vide;



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameSalle() {
        return NameSalle;
    }

    public void setNameSalle(String nameSalle) {
        NameSalle = nameSalle;
    }
}
