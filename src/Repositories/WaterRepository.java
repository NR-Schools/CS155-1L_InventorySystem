/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Models.WaterModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class WaterRepository extends BaseRepository {
    
    public WaterRepository() {}
    
    public void addWater(WaterModel water) {
        try {
            Connection con = createSQLConnection();
            
            Statement addWaterDB = con.createStatement();
            addWaterDB.executeUpdate(
                String.format("INSERT INTO WaterTable VALUES(null, %f, \"%s\");",
                        water.getAmount(),
                        water.getTimestamp()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(WaterRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<WaterModel> getWaters() {
        try {
            Connection con = createSQLConnection();
            
            Statement readFeedDB = con.createStatement();
            ResultSet results = readFeedDB.executeQuery("SELECT * FROM WaterTable");
            ArrayList<WaterModel> waters = new ArrayList<>();
            while(results.next()) {
                WaterModel water = new WaterModel();
                water.setId(results.getInt("Feed_ID"));
                water.setAmount(results.getInt("Feed_Amount"));
                water.setTimestamp(results.getDate("Feed_TimeStamp"));
                waters.add(water);
            }
            
            con.close();
            
            return waters;
        } catch (Exception ex) {
            Logger.getLogger(WaterRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new ArrayList<>();
    }
    
    public void updateWater(WaterModel water) {
        try {
            Connection con = createSQLConnection();
            
            Statement updateLivestockDB = con.createStatement();
            updateLivestockDB.executeUpdate(
                String.format("UPDATE WaterTable SET Water_Amount=%f, Water_TimeStamp=\"%s\" WHERE Water_ID = %d",
                            water.getAmount(),
                            water.getTimestamp(),
                            water.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(WaterRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteWater(WaterModel water) {
        try {
            Connection con = createSQLConnection();
            
            Statement deleteLivestockDB = con.createStatement();
            deleteLivestockDB.executeUpdate(
                String.format("DELETE FROM WaterTable WHERE Water_ID = %d",
                            water.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(WaterRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
