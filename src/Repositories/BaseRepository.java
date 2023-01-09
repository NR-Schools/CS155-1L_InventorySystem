/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public class BaseRepository {
    private String USERNAME = "sql6589200";
    private String PASSWORD = "5Ucl5F84KY";
    private final String LINK = "jdbc:mysql://sql6.freemysqlhosting.net:3306?useTimezone=true&serverTimezone=UTC";
    private final String CONNECTOR = "com.mysql.cj.jdbc.Driver";
    
    protected Connection createSQLConnection() throws Exception {
        Class.forName(CONNECTOR);
        
        Connection sql_con = DriverManager.getConnection(LINK, USERNAME, PASSWORD);
            
        Statement SetDB = sql_con.createStatement();
        SetDB.executeUpdate("USE sql6589200;");
            
        return sql_con;
    }
}
