/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author user
 */
public class koneksi {
    Connection c = null;
    public static Connection library(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_administry","root","");
            return c;
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,"Koneksi ke database gagal");
            return null;
        }
    }
}
