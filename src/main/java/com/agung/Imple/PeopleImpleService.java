/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agung.Imple;

import com.agung.Database.Databases;
import com.agung.entity.People;
import com.agung.inter.PeopleService;
import java.sql.PreparedStatement;

/**
 *
 * @author agung
 */
public class PeopleImpleService implements PeopleService{

    public void save(People p) {
        try {
        PreparedStatement ps = Databases.getkoneksi().prepareStatement("insert into people values (?,?)");
        ps.setString(1, p.getNim());
        ps.setString(2,p.getNama());
        ps.executeUpdate();
        } catch (Exception e) {
        }
        
                
    }
    
}
