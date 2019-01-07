/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject.Panels;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leslie_Rathnamalala
 */
public class DatabaseConnect {
    
      private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:src/JavaProjectDB.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
             System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
