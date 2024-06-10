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
@AnnotMap(nomTable = "v_prix_materiel")
public class V_prix_materiel {
    @Attribut(attr="nom_style")
    String nom_style;
    @Attribut(attr="type_volume")
    String type_volume;
    @Attribut(attr="total_prix")
    double prix_total;

    public V_prix_materiel() {
    }

    public V_prix_materiel(String nom_style, String type_volume, double prix_total) {
        this.nom_style = nom_style;
        this.type_volume = type_volume;
        this.prix_total = prix_total;
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

    public double getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(double prix_total) {
        this.prix_total = prix_total;
    }
    
    public List<V_prix_materiel> getMeublebyPrix(Connect conn,String prix_initial, String prix_final) throws SQLException, Exception{
        conn.getConnect();
        conn.setuses(true);
        V_prix_materiel vpm = new V_prix_materiel();
                List<V_prix_materiel> answer = new ArrayList<>();

        List<Object> ans = new ArrayList<>();
        try{
            ans = (List<Object>)GenericDAO.executeQuery("SELECT nom_style, type_volume, SUM(prix_total) AS total_prix FROM v_prix_materiel GROUP BY nom_style, type_volume HAVING SUM(prix_total) BETWEEN "+ prix_initial +" AND "+ prix_final,conn,vpm);
            
            for(int i = 0; i<ans.size(); i++){
                answer.add((V_prix_materiel)ans.get(i));
            }
        }
        catch(SQLException e){
        System.out.print(e);
        }
        finally{
        conn.close();
        }
        return answer;
    }
}
