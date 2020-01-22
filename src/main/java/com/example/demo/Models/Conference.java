package com.example.demo.Models;

import org.springframework.boot.autoconfigure.liquibase.LiquibaseDataSource;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;
@Component
@Entity
public class Conference {



    @Id
    @GeneratedValue
    private int Id;
    private String Theme;
    private Date DateDebut;
    private Date DateFin;
    private String Organizer;
    private String Description;
    private Boolean isPubl;
    private String TypeConference;
    private  String UrlImg;
    private Integer Capacite;
    private Float Price;
    private String Localisation;
    private boolean isValide;
    private String UrlRapport;
    private  String TypePayement;

    private Date DateJoin;

    public Date getDateJoin() {
        return DateJoin;
    }

    public void setDateJoin(Date dateJoin) {
        DateJoin = dateJoin;
    }

    /////////////////////////////////////////////////////////////////////////




    public String getTypePayement() {
        return TypePayement;
    }

    public void setTypePayement(String typePayement) {
        TypePayement = typePayement;
    }

    public boolean isValide() {
        return isValide;
    }

    public void setValide(boolean valide) {
        isValide = valide;
    }

    public String getUrlRapport() {
        return UrlRapport;
    }

    public void setUrlRapport(String urlRapport) {
        UrlRapport = urlRapport;
    }

    public String getLocalisation() {
        return Localisation;
    }

    public void setLocalisation(String localisation) {
        Localisation = localisation;
    }

    public Integer getCapacite() {
        return Capacite;
    }

    public void setCapacite(Integer capacite) {
        Capacite = capacite;
    }

    public Float getPrice() {
        return Price;
    }

    public void setPrice(Float price) {
        Price = price;
    }

    public String getUrlImg() {
        return UrlImg;
    }

    public void setUrlImg(String urlImg) {
        UrlImg = urlImg;
    }

    public String getTypeConference() {
        return TypeConference;
    }

    public void setTypeConference(String typeConference) {
        TypeConference = typeConference;
    }

    public Boolean getPubl() {
        return isPubl;
    }

    public void setPubl(Boolean publ) {
        isPubl = publ;
    }

    public String getOrganizer() {
        return Organizer;
    }

    public void setOrganizer(String organizer) {
        Organizer = organizer;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public Date getDateDebut() {
        return DateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        DateDebut = dateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setDateFin(Date dateFin) {
        DateFin = dateFin;
    }


    @Override
    public String toString() {
        return "Conference{" +
                "Id=" + Id +
                ", Theme='" + Theme + '\'' +
                ", DateDebut=" + DateDebut +
                ", DateFin=" + DateFin +
                ", Organizer='" + Organizer + '\'' +
                ", Description='" + Description + '\'' +
                ", isPubl=" + isPubl +
                ", TypeConference='" + TypeConference + '\'' +
                ", UrlImg='" + UrlImg + '\'' +
                ", Capacite=" + Capacite +
                ", Price=" + Price +
                ", Localisation='" + Localisation + '\'' +
                '}';
    }
}
