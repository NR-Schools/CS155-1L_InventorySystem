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
    private enum welfare { Healthy, Sick }; // Dead livestocks should be removed in the database
}
