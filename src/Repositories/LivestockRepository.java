/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Models.LivestockModel;
import Models.LivestockModel.LivestockWelfare;
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
public class LivestockRepository extends BaseRepository {
    
    // Make singleton (optional)
    private static LivestockRepository instance;
    public static LivestockRepository getRepository() {
        if(instance == null)
            instance = new LivestockRepository();
        return instance;
    }
    
    public void addLivestock(LivestockModel livestock) {
        try {
            Connection con = createSQLConnection();
            
            Statement addLivestockDB = con.createStatement();
            addLivestockDB.executeUpdate(
                String.format("INSERT INTO Livestock VALUES(null, %d, %f, %d, %d);",
                        livestock.getFeeds(),
                        livestock.getWater(),
                        livestock.getHarvest(),
                        livestock.getWelfare().ordinal()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(LivestockRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<LivestockModel> getLivestocks() {
        try {
            Connection con = createSQLConnection();
            
            Statement readLivestockDB = con.createStatement();
            ResultSet results = readLivestockDB.executeQuery("SELECT * FROM Livestock");
            ArrayList<LivestockModel> livestocks = new ArrayList<>();
            while(results.next()) {
                LivestockModel livestock = new LivestockModel();
                livestock.setId(results.getInt("Livestock_ID"));
                livestock.setFeeds(results.getInt("Livestock_Feeds"));
                livestock.setWater(results.getFloat("Livestock_Water"));
                livestock.setHarvest(results.getInt("Livestock_Harvest"));
                livestock.setWelfare(LivestockWelfare.values()[(results.getInt("Livestock_Welfare"))]);
                livestocks.add(livestock);
            }
            
            con.close();
            
            return livestocks;
        } catch (Exception ex) {
            Logger.getLogger(LivestockRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new ArrayList<>();
    }
    
    public void updateLivestock(LivestockModel livestock) {
        try {
            Connection con = createSQLConnection();
            
            Statement updateLivestockDB = con.createStatement();
            updateLivestockDB.executeUpdate(
                String.format("UPDATE Livestock SET Livestock_Feeds=%d, Livestock_Water=%f, Livestock_Harvest=%d, Livestock_Welfare=%d WHERE Livestock_ID = %d",
                            livestock.getFeeds(),
                            livestock.getWater(),
                            livestock.getHarvest(),
                            livestock.getWelfare().ordinal(),
                            livestock.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(LivestockRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteLivestock(LivestockModel livestock) {
        try {
            Connection con = createSQLConnection();
            
            Statement deleteLivestockDB = con.createStatement();
            deleteLivestockDB.executeUpdate(
                String.format("DELETE FROM Livestock WHERE Livestock_ID = %d",
                            livestock.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(LivestockRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
