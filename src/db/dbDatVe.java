/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;



/**
 *
 * @author Windows 10 Version 2
 */
public class dbDatVe {
    private static String DB_URL = "jdbc:sqlserver://DESKTOP-JJSJBVA\\SQLEXPRESS:1433;databaseName=QLDV;"
            + "databaseName=QLDV;"
            + "integratedSecurity=true";
    private static String USER_NAME = "nhom13";
    private static String PASSWORD = "9876543210";
    Connection conn;
    public Connection cnSQL(String dbURL, String userName, String password) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(dbURL, userName, password);
            System.out.println("Kết nối thành công!");
        } catch (Exception ex) {
            System.out.println("Kết nối thát bại!");
            ex.printStackTrace();
        }
        return conn;
    }
    public ResultSet HienThongTin(String tvSQL){
        try {
            Statement stmt = conn.createStatement();           
            ResultSet rs = stmt.executeQuery(tvSQL);
            return rs;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return null;
    }
    public void ChinhSuaThongTin(String tvSQL){
       
        try {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(tvSQL);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public String LayMa(String tvSQL){
        String value = null;
       try {
            Statement stmt = conn.createStatement();           
            ResultSet rslm = stmt.executeQuery(tvSQL);
            while (rslm.next())
                value = rslm.toString();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
            
        return value;
        
    }
}

    
