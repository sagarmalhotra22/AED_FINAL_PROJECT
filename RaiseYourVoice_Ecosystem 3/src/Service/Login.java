/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Interface.HospitalAdmin;
import Interface.VictimReporting;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 *  
 */
public class Login {
 String pass;
 String role;
 String Counter;
 String email;
 String passwor ;
 String table;

    public String UserLogin(String email, String passwor, String table) {
        this.email = email;
        this.passwor = passwor;
        this.table = table;
        
        
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
       }
     
    }
  

