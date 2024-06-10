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
@AnnotMap(nomTable = "V_commande_a_fabriquer")
public class V_commande_a_fabriquer {
    @Attribut(attr="style")
    String style;
    @Attribut(attr="quantite")
    double quantite;
    @Attribut(attr="volume")
    String volume;

    public V_commande_a_fabriquer() {
    }

    public V_commande_a_fabriquer(String style, double quantite, String volume) {
        this.style = style;
        this.quantite = quantite;
        this.volume = volume;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    
    
}
