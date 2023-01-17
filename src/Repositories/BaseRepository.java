/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public abstract class BaseRepository {
    private String USERNAME = "sql6590997";
    private String PASSWORD = "JX7vaTZMbm";
    private final String LINK = "jdbc:mysql://sql6.freemysqlhosting.net:3306?useTimezone=true&serverTimezone=UTC";
    private final String CONNECTOR = "com.mysql.cj.jdbc.Driver";
    
    protected Connection createSQLConnection() throws Exception {
        Class.forName(CONNECTOR);
        
        Connection sql_con = DriverManager.getConnection(LINK, USERNAME, PASSWORD);
            
        Statement SetDB = sql_con.createStatement();
        SetDB.executeUpdate("USE sql6590997;");
            
        return sql_con;
    }
}
