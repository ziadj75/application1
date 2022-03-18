package com.example.myapplication.beans;

public class Acteur {
    private int id;
    private String nom;
    private double rate;
    private String image;
    private static int comp;

    public Acteur(String nom, double rate, String image) {
        this.nom = nom;
        this.rate = rate;
        this.image = image;
        this.id = ++comp;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
