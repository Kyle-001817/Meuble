/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import back.dao.GenericDAO;
import back.frame.AnnotMap;
import back.frame.Attribut;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utils.Connect;

/**
 *
 * @author Kyle
 */
@AnnotMap(nomTable = "v_fabrication")
public class V_Fabrication {
    @Attribut(attr="id_fab",primary_key=true)
    String id_fab;
    @Attribut(attr="id_style")
    String id_style;
    @Attribut(attr="id_mat")
    String id_mat;
    @Attribut(attr="nom_materiel")
    String nom_materiel;
    @Attribut(attr="nom_style")
    String nom_style;
    
    public V_Fabrication(){}

    public String getId_fab() {
        return id_fab;
    }

    public void setId_fab(String id_fab) {
        this.id_fab = id_fab;
    }

    public String getId_style() {
        return id_style;
    }

    public void setId_style(String id_style) {
        this.id_style = id_style;
    }

    public String getId_mat() {
        return id_mat;
    }

    public void setId_mat(String id_mat) {
        this.id_mat = id_mat;
    }

    public String getNom_materiel() {
        return nom_materiel;
    }

    public void setNom_materiel(String nom_materiel) {
        this.nom_materiel = nom_materiel;
    }

    public String getNom_style() {
        return nom_style;
    }

    public void setNom_style(String nom_style) {
        this.nom_style = nom_style;
    }

    public V_Fabrication(String id_fab, String id_style, String id_mat, String nom_materiel, String nom_style) {
        this.id_fab = id_fab;
        this.id_style = id_style;
        this.id_mat = id_mat;
        this.nom_materiel = nom_materiel;
        this.nom_style = nom_style;
    }
    public List<V_Fabrication> getById(Connect conn, String id) throws SQLException{
        conn.getConnect();
        conn.setuses(true);
        V_Fabrication fabrication = new V_Fabrication();
        List<V_Fabrication> ans = new ArrayList<>();
        try{
        ArrayList<Object> source = GenericDAO.selectAll(fabrication, conn);
        for(int i = 0; i<source.size(); i++){
            V_Fabrication f = (V_Fabrication)source.get(i);
            if(f.getId_style().equals(id)){
                ans.add(f);
            }
        }
        }
        catch(SQLException e){
        System.out.print(e);
        }
        finally{
        conn.close();
        }
        return ans;
    }
    
}
