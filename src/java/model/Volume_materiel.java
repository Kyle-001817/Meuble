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
@AnnotMap(nomTable = "volume_materiel")
public class Volume_materiel {
    @Attribut(attr="id_mat")
    String id_mat;
    @Attribut(attr="id_style")
    String id_style;
    @Attribut(attr="id_volume")
    String id_volume;
    @Attribut(attr="id_unite")
    String id_unite;
    @Attribut(attr="quantite")
    double quantite;

    public Volume_materiel() {
    }

    public Volume_materiel(String id_mat, String id_style, String id_volume, String id_unite, double quantite) {
        this.id_mat = id_mat;
        this.id_style = id_style;
        this.id_volume = id_volume;
        this.id_unite = id_unite;
        this.quantite = quantite;
    }

    public String getId_mat() {
        return id_mat;
    }

    public void setId_mat(String id_mat) {
        this.id_mat = id_mat;
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

    public String getId_unite() {
        return id_unite;
    }

    public void setId_unite(String id_unite) {
        this.id_unite = id_unite;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
}
