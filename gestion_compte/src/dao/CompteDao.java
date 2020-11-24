/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Compte;

/**
 *
 * @author GABZO THIAW
 */
public class CompteDao {
    private List<Compte> tableCompte;

    public CompteDao() {
        tableCompte=new ArrayList<>();
    }
    
    public Compte add(Compte compte) {
        //Generer ID
        tableCompte.add(compte);
        return compte;
    }
    
    public List<Compte> lister() {
        //Generer ID
        return tableCompte;
    }
}
