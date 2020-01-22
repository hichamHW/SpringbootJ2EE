package com.example.demo.Models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Set;

@Component
@Entity
public class Profile {

    @Id
    @GeneratedValue
    private int Id;
    private String FullName;
    private String Email;
    private String Password;
    private String UrlImg;
    private String NumeroPhone0;
    private String NumeroPhone1;
    private String TypeUser;
    private String Adresse;



    @OneToMany(targetEntity = Conference.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_profileCreate",referencedColumnName = "Id")

    private Set<Conference> conferencesCreate;

    public Set<Conference> getConferencesCreate() {
        return conferencesCreate;
    }

    public void setConferencesCreate(Set<Conference> conferencesCreate) {
        this.conferencesCreate = conferencesCreate;
    }

    public Set<Conference> getConferencesShow() {
        return conferencesShow;
    }

    public void setConferencesShow(Set<Conference> conferencesShow) {
        this.conferencesShow = conferencesShow;
    }

    @ManyToMany(targetEntity = Conference.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Id_profileShow",referencedColumnName = "Id")

    private Set<Conference> conferencesShow;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUrlImg() {
        return UrlImg;
    }

    public void setUrlImg(String urlImg) {
        UrlImg = urlImg;
    }

    public String getNumeroPhone0() {
        return NumeroPhone0;
    }

    public void setNumeroPhone0(String numeroPhone0) {
        NumeroPhone0 = numeroPhone0;
    }

    public String getNumeroPhone1() {
        return NumeroPhone1;
    }

    public void setNumeroPhone1(String numeroPhone1) {
        NumeroPhone1 = numeroPhone1;
    }

    public String getTypeUser() {
        return TypeUser;
    }

    public void setTypeUser(String typeUser) {
        TypeUser = typeUser;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }


    @Override
    public String toString() {
        return "Profile{" +
                "Id=" + Id +
                ", FullName='" + FullName + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", UrlImg='" + UrlImg + '\'' +
                ", NumeroPhone0='" + NumeroPhone0 + '\'' +
                ", NumeroPhone1='" + NumeroPhone1 + '\'' +
                ", TypeUser='" + TypeUser + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", conferencesCreate=" + conferencesCreate +
                ", conferencesShow=" + conferencesShow +
                '}';
    }
}
