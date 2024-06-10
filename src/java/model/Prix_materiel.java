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
@AnnotMap(nomTable = "prix_materiel")
public class Prix_materiel {
    @Attribut(attr="id_prix_materiel",primary_key=true)
    String id_prix_materiel;
    @Attribut(attr="id_materiel")
    String id_materiel;
    @Attribut(attr="prix")
    double prix;

    public Prix_materiel() {
    }

    public String getId_prix_materiel() {
        return id_prix_materiel;
    }

    public void setId_prix_materiel(String id_prix_materiel) {
        this.id_prix_materiel = id_prix_materiel;
    }

    public String getId_materiel() {
        return id_materiel;
    }

    public void setId_materiel(String id_materiel) {
        this.id_materiel = id_materiel;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public Prix_materiel(String id_prix_materiel, String id_materiel, double prix) {
        this.id_prix_materiel = id_prix_materiel;
        this.id_materiel = id_materiel;
        this.prix = prix;
    }
    public List<Prix_materiel> getMaterielbyPrix(Connect conn,double prix_initial, double prix_final) throws Exception{
        conn.getConnect();
        conn.setuses(true);
        Prix_materiel prix = new Prix_materiel();
        List<Prix_materiel> ans = new ArrayList<>();
        try{
            ArrayList<Object> source = GenericDAO.selectAll(prix, conn);
            
            for(int i = 0; i<source.size(); i++){
                Prix_materiel f = (Prix_materiel)source.get(i);
                if(prix_initial <= f.getPrix() && prix_final >f.getPrix()){
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
    public List<Materiel> getById(Connect conn, String id) throws SQLException{
        conn.getConnect();
        conn.setuses(true);
        Materiel fabrication = new Materiel();
        List<Materiel> ans = new ArrayList<>();
        try{
        ArrayList<Object> source = GenericDAO.selectAll(fabrication, conn);
        for(int i = 0; i<source.size(); i++)
        {
            Materiel f = (Materiel)source.get(i);
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
    
}
