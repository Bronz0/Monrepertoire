package com.bronzo.monrepertoire.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "ami_table")
public class Ami {

    @PrimaryKey(autoGenerate =  true)
    int id;

    String nom;

    String prenom;

    String numTel;

    public Ami(int id, String nom, String prenom, String numTel) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.numTel = numTel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
}
