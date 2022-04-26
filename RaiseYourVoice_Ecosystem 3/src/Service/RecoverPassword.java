/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 *  
 */
public class RecoverPassword {
    String email;
    String petname;
    String user;
    String pass;
    String question;
    String rpass;
    
    public String ReturnPassword(String email, String petname,String user){
    this.email =email;
    this.petname= petname;
    this.user = user;
    
     DBConnection DBcon = new DBConnection();
        
        Connection con= DBcon.getDbcon();
    
        
     return pass; }
}
