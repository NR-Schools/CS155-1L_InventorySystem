/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author hp
 */
public class LivestockModel {
    private int id; // Identification of Livestock
    private int feeds; // Amount of feeds available for that livestock (Per Pack)
    private float water; // Amount of water available for that livestock (Per Liter)
    private int harvest; // Amount of egg harvest available for that livestock (Per piece)
    public enum LivestockWelfare { Healthy, Sick }; // Dead livestocks should be removed in the database
    private LivestockWelfare welfare;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFeeds() {
        return feeds;
    }

    public void setFeeds(int feeds) {
        this.feeds = feeds;
    }

    public float getWater() {
        return water;
    }

    public void setWater(float water) {
        this.water = water;
    }

    public int getHarvest() {
        return harvest;
    }

    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    public LivestockWelfare getWelfare() {
        return welfare;
    }

    public void setWelfare(LivestockWelfare welfare) {
        this.welfare = welfare;
    }
    
}
