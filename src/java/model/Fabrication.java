package model;

import back.frame.AnnotMap;
import back.frame.Attribut;

@AnnotMap(nomTable = "fabrication")
public class Fabrication {

    public Fabrication() {
    }

    public Fabrication(String id_fab, String id_style, String id_mat) {
        this.id_fab = id_fab;
        this.id_style = id_style;
        this.id_mat = id_mat;
    }
    @Attribut(attr="id_fab",primary_key=true)
    String id_fab;
    @Attribut(attr="id_style")
    String id_style;
    @Attribut(attr="id_mat")
    String id_mat;



    public String getId_fab(){
        return this.id_fab;
    }

    public void setId_fab(String id_fab){
        this.id_fab = id_fab;
    }

    public String getId_style(){
        return this.id_style;
    }

    public void setId_style(String id_style){
        this.id_style = id_style;
    }

    public String getId_mat(){
        return this.id_mat;
    }

    public void setId_mat(String id_mat){
        this.id_mat = id_mat;
    }
}
