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
@AnnotMap(nomTable = "volume")
public class Volume {
    @Attribut(attr="id_volume",primary_key=true)
    String id_volume;
    @Attribut(attr="types")
    String types;

    public Volume(String id_volume, String types) {
        this.id_volume = id_volume;
        this.types = types;
    }

    public Volume() {
    }

    public String getId_volume() {
        return id_volume;
    }

    public void setId_volume(String id_volume) {
        this.id_volume = id_volume;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }
    
}
