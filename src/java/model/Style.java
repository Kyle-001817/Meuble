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
@AnnotMap(nomTable = "style")
public class Style {

    public Style() {
    }

    public Style(String id_style, String nom) {
        this.id_style = id_style;
        this.nom = nom;
    }
    
    @Attribut(attr="id_style",primary_key=true)
    String id_style;
    @Attribut(attr="nom")
    String nom;



    public String getId_style(){
        return this.id_style;
    }

    public void setId_style(String id_style){
        this.id_style = id_style;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
}
