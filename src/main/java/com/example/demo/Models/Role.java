package com.example.demo.Models;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Set;

public class RoleUser {

    private int Id;
    private String Namerole;



    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNamerole() {
        return Namerole;
    }

    public void setNamerole(String namerole) {
        Namerole = namerole;
    }
}
