package model;

import back.frame.AnnotMap;
import back.frame.Attribut;

/**
 *
 * @author Kyle
 */
@AnnotMap(nomTable = "style_ouvrier")
public class Style_Ouvrier {
    @Attribut(attr="id_style_ouvrier",primary_key=true)
    String id_style_ouvrier;
    @Attribut(attr="id_style")
    String id_style;
    @Attribut(attr="id_ouvrier")
    String id_ouvrier;
    @Attribut(attr="horaire")
    double horaire;

    public Style_Ouvrier() {
    }

    public Style_Ouvrier(String id_style_ouvrier, String id_style, String id_ouvrier, double horaire) {
        this.id_style_ouvrier = id_style_ouvrier;
        this.id_style = id_style;
        this.id_ouvrier = id_ouvrier;
        this.horaire = horaire;
    }

    public String getId_style_ouvrier() {
        return id_style_ouvrier;
    }

    public void setId_style_ouvrier(String id_style_ouvrier) {
        this.id_style_ouvrier = id_style_ouvrier;
    }

    public String getId_style() {
        return id_style;
    }

    public void setId_style(String id_style) {
        this.id_style = id_style;
    }

    public String getId_ouvrier() {
        return id_ouvrier;
    }

    public void setId_ouvrier(String id_ouvrier) {
        this.id_ouvrier = id_ouvrier;
    }

    public double getHoraire() {
        return horaire;
    }

    public void setHoraire(double horaire) {
        this.horaire = horaire;
    }
            
    
}
