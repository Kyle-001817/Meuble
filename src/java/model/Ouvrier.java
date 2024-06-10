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
@AnnotMap(nomTable = "ouvrier")
public class Ouvrier {
    @Attribut(attr="id_ouvrier",primary_key=true)
    String id_ouvrier;
    @Attribut(attr="fonction")
    String fonction;
    @Attribut(attr="karama")
    double karama;

    public Ouvrier() {
    }

    public Ouvrier(String id_ouvrier, String fonction, double karama) {
        this.id_ouvrier = id_ouvrier;
        this.fonction = fonction;
        this.karama = karama;
    }

    public String getId_ouvrier() {
        return id_ouvrier;
    }

    public void setId_ouvrier(String id_ouvrier) {
        this.id_ouvrier = id_ouvrier;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public double getKarama() {
        return karama;
    }

    public void setKarama(double karama) {
        this.karama = karama;
    }
    
    
}
