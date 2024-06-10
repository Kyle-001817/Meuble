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
@AnnotMap(nomTable = "materiel")
public class Materiel {
    @Attribut(attr="id_mat",primary_key=true)
    String id_mat;
    @Attribut(attr="nom")
    String nom;

    public Materiel() {
    }

    public Materiel(String id_mat, String nom) {
        this.id_mat = id_mat;
        this.nom = nom;
    }

    public String getId_mat(){
        return this.id_mat;
    }

    public void setId_mat(String id_mat){
        this.id_mat = id_mat;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
}
