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
@AnnotMap(nomTable = "prix_style")
public class Prix_style {
    @Attribut(attr="id_prix_style",primary_key=true)
    String id_prix_style;
    @Attribut(attr="id_style")
    String id_style;
    @Attribut(attr="id_volume")
    String id_volume;
    @Attribut(attr="prix")
    double prix;

    public Prix_style() {
    }

    public Prix_style(String id_prix_style, String id_style, String id_volume, double prix) {
        this.id_prix_style = id_prix_style;
        this.id_style = id_style;
        this.id_volume = id_volume;
        this.prix = prix;
    }

    public String getId_prix_style() {
        return id_prix_style;
    }

    public void setId_prix_style(String id_prix_style) {
        this.id_prix_style = id_prix_style;
    }

    public String getId_style() {
        return id_style;
    }

    public void setId_style(String id_style) {
        this.id_style = id_style;
    }

    public String getId_volume() {
        return id_volume;
    }

    public void setId_volume(String id_volume) {
        this.id_volume = id_volume;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
