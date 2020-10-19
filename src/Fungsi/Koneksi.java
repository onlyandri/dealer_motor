/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fungsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author STMIK-VI
 */
public class Koneksi {
    public static Connection konek;
    public Connection koneksiDatabase()
    {
    try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver MySQL ditemukan");
            String url = "jdbc:mysql://localhost:3306/dealermotor";
            String user = "root";
            String pass = "";
            konek = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Database Sukses");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Driver MySQL tidak ditemukan");
        } catch (SQLException e) 
        {
            System.out.println("Koneksi Database Gagal");
        }
        return konek;
    }
}
