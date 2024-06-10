/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import back.frame.AnnotMap;
import back.frame.Attribut;
import dao.GenericDAO;
import java.util.ArrayList;
import java.util.List;
import utils.Connect;
/**
 *
 * @author Kyle
 */
@AnnotMap(nomTable = "commande_a_fabriquer")
public class Commande_a_Fabrique {
    
    public Commande_a_Fabrique () {
    }

    public Commande_a_Fabrique (String id_commande, String id_style, String type_volume, double quantite) {
        this.id_commande = id_commande;
        this.id_style = id_style;
        this.type_volume = type_volume;
        this.quantite = quantite;
    }
    
    @Attribut(attr="id_commande",primary_key=true)
    String id_commande;
    @Attribut(attr="id_style")
    String id_style;
    @Attribut(attr="id_volume")
    String type_volume;
    @Attribut(attr="quantite")
    double quantite;

    
    public String getId_commande() { return id_commande; }
    public String getId_style() { return id_style; }
    public double getQuantite() { return quantite;}
    public String getType_volume() {return type_volume; }
    
    public void setId_commande(String id_commande) { this.id_commande = id_commande;}
    public void setId_style(String id_style) { this.id_style = id_style;}
    public void setQuantite(double quantite) { this.quantite = quantite; }
    public void setType_volume(String type_volume) { this.type_volume = type_volume; }
    
}
