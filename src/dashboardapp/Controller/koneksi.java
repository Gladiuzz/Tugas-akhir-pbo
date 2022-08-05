/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboardapp.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class koneksi {
    public static Connection koneksi;
    public static Statement stm;
    public static ResultSet rs;
    
    public Connection getConnetion(String sql){
        try {
            String url = "jdbc:mysql://localhost/inventaris_pbo";
            String user= "root";
            String pass= "";
            koneksi = (com.mysql.jdbc.Connection) DriverManager.getConnection(url,user,pass);
            stm = koneksi.createStatement();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
            System.exit(0);
            
        }
        return koneksi;
    }
    
}
