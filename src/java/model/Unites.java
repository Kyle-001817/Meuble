/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import back.frame.AnnotMap;
import back.frame.Attribut;

/**
 *
 * @author Kyle
 */
@AnnotMap(nomTable = "unites")
public class Unites {
    @Attribut(attr="id_unite",primary_key=true)
    String id_unite;
    @Attribut(attr="nom")
    String nom;

    public String getId_unite() {
        return id_unite;
    }

    public void setId_unite(String id_unite) {
        this.id_unite = id_unite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Unites(String id_unite, String nom) {
        this.id_unite = id_unite;
        this.nom = nom;
    }

    public Unites() {
    }
    
    
}
