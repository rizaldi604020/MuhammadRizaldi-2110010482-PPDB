/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppdb;

/**
 *
 * @author lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    public static Connection mysqlkoneksi;
    public static Connection koneksiDB() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/ppdb";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlkoneksi = DriverManager.getConnection(url,user,pass);
        }
          catch (Exception e) {
              System.err.println("Koneksi Gagal"+e.getMessage());
          }      
        return mysqlkoneksi;
    }
    
}
