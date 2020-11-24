/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GABZO THIAW
 */
public class Compte {
    private int id;
    private String numero;
    private double solde;
    
    //propriété de navigation
    //ManyToOne
    private Partenaire partenaire;
    //OneToMany
    private List<Depot> depots;
    
    public Compte() {
        this.depots=new ArrayList<>();
    }
    
    //constructeur

    public Compte(int id, String numero, double solde) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.depots=new ArrayList<>();
    }

    public Compte(int id, String numero, double solde, Partenaire partenaire) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.partenaire = partenaire;
        this.depots=new ArrayList<>();
    }
    //getter
    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    public Partenaire getPartenaire() {
        return partenaire;
    }
    
    //setter

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setPartenaire(Partenaire partenaire) {
        this.partenaire = partenaire;
    }
    
}
