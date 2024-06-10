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
@AnnotMap(nomTable = "ouvrier_travail_sur_un_style")
public class Ouvrier_travail_sur_un_style {
    @Attribut(attr="id_ouvrier_travail_sur_un_style",primary_key=true)
    String id_ouvrier_travail_sur_un_style;
    @Attribut(attr="id_style")
    String id_style;
    @Attribut(attr="id_volume")
    String id_volume;
    @Attribut(attr="id_ouvrier")
    String id_ouvrier;
    @Attribut(attr="nombre")
    int nombre;

    public Ouvrier_travail_sur_un_style() {
    }

    public Ouvrier_travail_sur_un_style(String id_ouvrier_travail_sur_un_style, String id_style, String id_volume, String id_ouvrier, int nombre) {
        this.id_ouvrier_travail_sur_un_style = id_ouvrier_travail_sur_un_style;
        this.id_style = id_style;
        this.id_volume = id_volume;
        this.id_ouvrier = id_ouvrier;
        this.nombre = nombre;
    }

    public String getId_ouvrier_travail_sur_un_style() {
        return id_ouvrier_travail_sur_un_style;
    }

    public void setId_ouvrier_travail_sur_un_style(String id_ouvrier_travail_sur_un_style) {
        this.id_ouvrier_travail_sur_un_style = id_ouvrier_travail_sur_un_style;
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

    public String getId_ouvrier() {
        return id_ouvrier;
    }

    public void setId_ouvrier(String id_ouvrier) {
        this.id_ouvrier = id_ouvrier;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
    
}
