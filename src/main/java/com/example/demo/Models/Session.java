package com.example.demo.Models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
@Component

@Entity
public class Session {

    @Id
    @GeneratedValue
    private  int Id;
    private String Sujet;
    private String Speaker;
    private Date DateDebut;
    private Date DateFin;
    private Boolean isValie;

    public Boolean getValie() {
        return isValie;
    }

    public void setValie(Boolean valie) {
        isValie = valie;
    }

    public String getSpeaker() {
        return Speaker;
    }

    public void setSpeaker(String speaker) {
        Speaker = speaker;
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

    @ManyToOne(targetEntity = Conference.class,cascade = CascadeType.ALL)
    @JoinColumn(name="Id_conference",referencedColumnName = "Id")
    private Conference conference;

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }


    @OneToOne(targetEntity = Salle.class,cascade = CascadeType.ALL)
    @JoinColumn(name="Id_salle",referencedColumnName = "Id")
    private Salle salle;

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getSujet() {
        return Sujet;
    }

    public void setSujet(String sujet) {
        Sujet = sujet;
    }
}
