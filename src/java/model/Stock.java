
package model;

import back.dao.GenericDAO;
import back.frame.AnnotMap;
import back.frame.Attribut;
import java.util.List;
import utils.Connect;

/**
 *
 * @author Kyle
 */

@AnnotMap(nomTable = "stock")
public class Stock {

    public Stock () {
    }

    public Stock(String id_stock, String id_materiel, double quantite, String id_unite) {
        this.id_stock = id_stock;
        this.id_materiel = id_materiel;
        this.quantite = quantite;
        this.id_unite = id_unite;
    }
    
    @Attribut(attr="id_stock",primary_key=true)
    String id_stock;
    @Attribut(attr="id_materiel")
    String id_materiel;
    @Attribut(attr="quantite")
    double quantite;
    @Attribut(attr="id_unite")
    String id_unite;

    
    public String getId_stock() {
        return id_stock;
    }
    public String getId_unite() {
        return id_unite;
    }

    public String getId_materiel() {
        return id_materiel;
    }

    public void setId_materiel(String id_materiel) {
        this.id_materiel = id_materiel;
    }
    
    public double getQuantite() {
        return quantite;
    }
    public void setId_stock(String id_stock) {
        this.id_stock = id_stock;
    }
    public void setId_unite(String id_unite) {
        this.id_unite = id_unite;
    }
    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }
    
    public Stock SelectSommeStock(Connect co, String id_materiel) throws Exception{
        Stock valiny = new Stock();
        List<Object> source = GenericDAO.selectAll(valiny, co);
        double quantite = 0;
        for(int i = 0; i<source.size(); i++){
            valiny = (Stock)source.get(i);
            if(valiny.getId_materiel().equals(id_materiel)){
                quantite += valiny.getQuantite();
            }
        }
        
        valiny.setQuantite(quantite);
        valiny.setId_materiel(id_materiel);
        return valiny;
    }
    
}
