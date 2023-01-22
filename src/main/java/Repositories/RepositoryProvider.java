/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

/**
 *
 * @author hp
 */
public class RepositoryProvider {
    
    AuthRepository auth_repo;
    FeedRepository feed_repo;
    WaterRepository water_repo;
    HarvestRepository harvest_repo;
    
    // make singleton
    private static RepositoryProvider provider;
    public static RepositoryProvider getProvider() {
        if (provider == null)
            provider = new RepositoryProvider();
        return provider;
    }
    
    private RepositoryProvider() {
        auth_repo = new AuthRepository();
        feed_repo = new FeedRepository();
        water_repo = new WaterRepository();
        harvest_repo = new HarvestRepository();
    }
    
    // Add Repositories
    
    public AuthRepository getAuthRepo() {
        return auth_repo;
    }
    
    public FeedRepository getFeedRepo() {
        return feed_repo;
    }
    
    public WaterRepository getWaterRepo() {
        return water_repo;
    }
    
    public HarvestRepository getHarvestRepo() {
        return harvest_repo;
    }
}
