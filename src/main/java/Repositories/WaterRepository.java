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
            
            Statement readWaterDB = con.createStatement();
            ResultSet results = readWaterDB.executeQuery("SELECT * FROM WaterTable");
            ArrayList<WaterModel> waters = new ArrayList<>();
            while(results.next()) {
                WaterModel water = new WaterModel();
                water.setId(results.getInt("Water_ID"));
                water.setAmount(results.getDouble("Water_Amount"));
                water.setTimestamp(results.getTimestamp("Water_TimeStamp"));
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
            
            Statement updateWaterDB = con.createStatement();
            updateWaterDB.executeUpdate(
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
            
            Statement deleteWaterDB = con.createStatement();
            deleteWaterDB.executeUpdate(
                String.format("DELETE FROM WaterTable WHERE Water_ID = %d",
                            water.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(WaterRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double getTotalFeeds() {
        double totalWater = 0;
        
        try {
            Connection con = createSQLConnection();
            
            Statement readWaterDB = con.createStatement();
            ResultSet results = readWaterDB.executeQuery("SELECT SUM(Water_Amount) AS TotalAmount FROM WaterTable");
            results.next();
            totalWater = results.getDouble("TotalAmount");
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(FeedRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return totalWater;
    }
}
