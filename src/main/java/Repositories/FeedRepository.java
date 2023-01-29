/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Models.FeedModel;
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
    
    public void addFeed(FeedModel feed) {
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
            Logger.getLogger(FeedRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<FeedModel> getFeeds() {
        try {
            Connection con = createSQLConnection();
            
            Statement readFeedDB = con.createStatement();
            ResultSet results = readFeedDB.executeQuery("SELECT * FROM FeedTable");
            ArrayList<FeedModel> feeds = new ArrayList<>();
            while(results.next()) {
                FeedModel feed = new FeedModel();
                feed.setId(results.getInt("Feed_ID"));
                feed.setAmount(results.getDouble("Feed_Amount"));
                feed.setPrice(results.getDouble("Feed_Price"));
                feed.setTimestamp(results.getTimestamp("Feed_TimeStamp"));
                feeds.add(feed);
            }
            
            con.close();
            
            return feeds;
        } catch (Exception ex) {
            Logger.getLogger(FeedRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return new ArrayList<>();
    }
    
    public void updateFeed(FeedModel feed) {
        try {
            Connection con = createSQLConnection();
            
            Statement updateFeedDB = con.createStatement();
            updateFeedDB.executeUpdate(
                String.format("UPDATE FeedTable SET Feed_Amount=%f, Feed_Price=%f, Feed_TimeStamp=\"%s\" WHERE Feed_ID = %d",
                            feed.getAmount(),
                            feed.getPrice(),
                            feed.getTimestamp(),
                            feed.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(FeedRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteFeed(FeedModel feed) {
        try {
            Connection con = createSQLConnection();
            
            Statement deleteFeedDB = con.createStatement();
            deleteFeedDB.executeUpdate(
                String.format("DELETE FROM FeedTable WHERE Feed_ID = %d",
                            feed.getId()
                )
            );
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(FeedRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double getTotalFeeds() {
        double totalFeeds = 0;
        
        try {
            Connection con = createSQLConnection();
            
            Statement readFeedDB = con.createStatement();
            ResultSet results = readFeedDB.executeQuery("SELECT SUM(Feed_Amount) AS TotalAmount FROM FeedTable");
            results.next();
            totalFeeds = results.getDouble("TotalAmount");
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(FeedRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return totalFeeds;
    }
    
    public double getMonthlyAverageFeedConsumption() {
        double monthlyAverageFeed = 0;
        
        try {
            Connection con = createSQLConnection();
            
            Statement readFeedDB = con.createStatement();
            ResultSet results = readFeedDB.executeQuery(
                    "SELECT COALESCE(AVG(ABS(Feed_Amount)))\n" +
                    "AS AverageAmountPerMonth\n" +
                    "FROM FeedTable\n" +
                    "WHERE FeedTable.Feed_TimeStamp >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH)\n" +
                    "AND FeedTable.Feed_Amount < 0;");
            results.next();
            monthlyAverageFeed = results.getDouble("AverageAmountPerMonth");
            
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(FeedRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return monthlyAverageFeed;
    }
}
