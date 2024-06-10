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
@AnnotMap(nomTable = "v_volume_matiere")
public class V_Volume_materiel {
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
    @Attribut(attr="nom_materiel")
    String nom_materiel;
    @Attribut(attr="nom_style")
    String nom_style;
    @Attribut(attr="type_volume")
    String type_volume;
    @Attribut(attr="nom_unite")
    String nom_unite;

    public V_Volume_materiel() {
    }

    public V_Volume_materiel(String id_mat, String id_style, String id_volume, String id_unite, double quantite, String nom_materiel, String nom_style, String type_volume, String nom_unite) {
        this.id_mat = id_mat;
        this.id_style = id_style;
        this.id_volume = id_volume;
        this.id_unite = id_unite;
        this.quantite = quantite;
        this.nom_materiel = nom_materiel;
        this.nom_style = nom_style;
        this.type_volume = type_volume;
        this.nom_unite = nom_unite;
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

    public String getType_volume() {
        return type_volume;
    }

    public void setType_volume(String type_volume) {
        this.type_volume = type_volume;
    }

    public String getNom_unite() {
        return nom_unite;
    }

    public void setNom_unite(String nom_unite) {
        this.nom_unite = nom_unite;
    }
    public List<V_Volume_materiel> getById(Connect conn, String id) throws SQLException{
        conn.getConnect();
        conn.setuses(true);
        V_Volume_materiel fabrication = new V_Volume_materiel();
        List<V_Volume_materiel> ans = new ArrayList<>();
        try{
        ArrayList<Object> source = GenericDAO.selectAll(fabrication, conn);
        for(int i = 0; i<source.size(); i++){
            V_Volume_materiel f = (V_Volume_materiel)source.get(i);
            if(f.getId_mat().equals(id)){
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
    
//    public List<V_Volume_materiel> traitement_Fabrication(Connect co,String style,String volume,double quantite) throws Exception{
//        
//        List<V_Volume_materiel> valiny = new ArrayList<>();
//        V_Volume_materiel vvm = new V_Volume_materiel();
//        Stock stock = new Stock();
//        List<Object> source = GenericDAO.executeQuery("select *from v_volume_matiere where id_style = '"+ style +"' and id_volume = '"+ volume +"'", co, vvm);
//        for(int i = 0; i<source.size(); i++)
//        {
//            vvm = (V_Volume_materiel)source.get(i);
//            if(vvm.getId_mat().equals(stock.SelectSommeStock(co, vvm.getId_mat()).getId_materiel()))
//            {
//                if(vvm.getQuantite() * quantite < stock.SelectSommeStock(co, vvm.getId_mat()).getQuantite())
//                {
//                     valiny.add(vvm);
//                }
//            }
//        }
//        return valiny;
//    }
    
    public boolean traitement_Fabrication(Connect co,String style,String volume,double quantite) throws Exception{
        
        boolean valiny = false;
        V_Volume_materiel vvm = new V_Volume_materiel();
        Stock stock = new Stock();
        List<Object> source = GenericDAO.executeQuery("select *from v_volume_matiere where id_style = '"+ style +"' and id_volume = '"+ volume +"'", co, vvm);
        for(int i = 0; i<source.size(); i++)
        {
            vvm = (V_Volume_materiel)source.get(i);
            if(vvm.getId_mat().equals(stock.SelectSommeStock(co, vvm.getId_mat()).getId_materiel()))
            {
                if(vvm.getQuantite() * quantite < stock.SelectSommeStock(co, vvm.getId_mat()).getQuantite())
                {
                     valiny = true;
                }
            }
        }
        return valiny;
    }
}
