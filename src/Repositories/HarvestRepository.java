/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Models.HarvestModel;
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
public class HarvestRepository extends BaseRepository {
    
    public HarvestRepository() {}
    
    public void addHarvest(HarvestModel harvest) {
        try {
            Connection con = createSQLConnection();
            
            Statement addHarvestDB = con.createStatement();
            addHarvestDB.executeUpdate(
                String.format("INSERT INTO HarvestTable VALUES(null, %d, \"%s\");",
                        harvest.getAmount(),
                        harvest.getTimestamp()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(HarvestRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<HarvestModel> getHarvests() {
        try {
            Connection con = createSQLConnection();
            
            Statement readHarvestDB = con.createStatement();
            ResultSet results = readHarvestDB.executeQuery("SELECT * FROM HarvestTable");
            ArrayList<HarvestModel> harvests = new ArrayList<>();
            while(results.next()) {
                HarvestModel harvest = new HarvestModel();
                harvest.setId(results.getInt("Harvest_ID"));
                harvest.setAmount(results.getInt("Harvest_Amount"));
                harvest.setTimestamp(results.getTimestamp("Harvest_TimeStamp"));
                harvests.add(harvest);
            }
            
            con.close();
            
            return harvests;
        } catch (Exception ex) {
            Logger.getLogger(HarvestRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new ArrayList<>();
    }
    
    public void updateHarvest(HarvestModel harvest) {
        try {
            Connection con = createSQLConnection();
            
            Statement updateHarvestDB = con.createStatement();
            updateHarvestDB.executeUpdate(
                String.format("UPDATE HarvestTable SET Harvest_Amount=%d, Harvest_TimeStamp=\"%s\" WHERE Harvest_ID = %d",
                            harvest.getAmount(),
                            harvest.getTimestamp(),
                            harvest.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(HarvestRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteHarvest(HarvestModel harvest) {
        try {
            Connection con = createSQLConnection();
            
            Statement deleteHarvestDB = con.createStatement();
            deleteHarvestDB.executeUpdate(
                String.format("DELETE FROM HarvestTable WHERE Harvest_ID = %d",
                            harvest.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(HarvestRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getTotalFeeds() {
        int totalHarvests = 0;
        
        try {
            Connection con = createSQLConnection();
            
            Statement readWaterDB = con.createStatement();
            ResultSet results = readWaterDB.executeQuery("SELECT SUM(Harvest_Amount) AS TotalAmount FROM HarvestTable");
            results.next();
            totalHarvests = results.getInt("TotalAmount");
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(FeedRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return totalHarvests;
    }
}
