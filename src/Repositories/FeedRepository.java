/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Models.FeedModel;
import Models.LivestockModel;
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
public class FeedRepository extends BaseRepository {
    
    public FeedRepository() {}
    
    public void addLivestock(FeedModel feed) {
        try {
            Connection con = createSQLConnection();
            
            Statement addFeedDB = con.createStatement();
            addFeedDB.executeUpdate(
                String.format("INSERT INTO FeedTable VALUES(null, %f, %f, \"%s\");",
                        feed.getAmount(),
                        feed.getPrice(),
                        feed.getTimestamp()
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
            
            Statement readFeedDB = con.createStatement();
            ResultSet results = readFeedDB.executeQuery("SELECT * FROM FeedTable");
            ArrayList<LivestockModel> livestocks = new ArrayList<>();
            while(results.next()) {
                FeedModel feed = new FeedModel();
                feed.setId(results.getInt("Feed_ID"));
                feed.setAmount(results.getInt("Feed_Amount"));
                feed.setPrice(results.getFloat("Feed_Price"));
                feed.setTimestamp(results.getDate("Feed_TimeStamp"));
            }
            
            con.close();
            
            return livestocks;
        } catch (Exception ex) {
            Logger.getLogger(LivestockRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new ArrayList<>();
    }
    
    public void updateLivestock(FeedModel feed) {
        try {
            Connection con = createSQLConnection();
            
            Statement updateLivestockDB = con.createStatement();
            updateLivestockDB.executeUpdate(
                String.format("UPDATE FeedTable SET Feed_Amount=%f, Feed_Price=%f, Feed_TimeStamp=\"%s\" WHERE Feed_ID = %d",
                            feed.getAmount(),
                            feed.getPrice(),
                            feed.getTimestamp(),
                            feed.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(LivestockRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteLivestock(FeedModel feed) {
        try {
            Connection con = createSQLConnection();
            
            Statement deleteLivestockDB = con.createStatement();
            deleteLivestockDB.executeUpdate(
                String.format("DELETE FROM FeedTable WHERE Feed_ID = %d",
                            feed.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(LivestockRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
