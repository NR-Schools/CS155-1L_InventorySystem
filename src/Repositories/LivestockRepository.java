/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import Models.LivestockModel;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class LivestockRepository {
    
    // Make singleton (optional)
    private static LivestockRepository instance;
    public static LivestockRepository getRepository() {
        if(instance == null)
            instance = new LivestockRepository();
        return instance;
    }
    
    public void addLivestock(LivestockModel livestock) {
        // TODO
    }
    
    public ArrayList<LivestockModel> getLivestocks() {
        // TODO
        return null;
    }
    
    public void updateLivestock(LivestockModel livestock) {
        // TODO
    }
    
    public void deleteLivestock(LivestockModel livestock) {
        // TODO
    }
}
