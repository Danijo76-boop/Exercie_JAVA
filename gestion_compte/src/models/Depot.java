/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

/**
 *
 * @author GABZO THIAW
 */
public class Depot {
    private int id;
    private double montant;
    private LocalDate createAt;

    //constructeur
    public Depot() {
    }

    public Depot(double montant) {
        this.montant = montant;
        this.createAt=LocalDate.now();
    }

    public Depot(int id, double montant, LocalDate createAt) {
        this.id = id;
        this.montant = montant;
        this.createAt = createAt;
    }

    //getter
    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDate getCreateAt() {
        return createAt;
    }
    
    //getter

    public void setId(int id) {
        this.id = id;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setCreateAt(LocalDate createAt) {
        this.createAt = createAt;
    }
    
}
