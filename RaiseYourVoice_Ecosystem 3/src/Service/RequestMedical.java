/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 *  
 */
public class RequestMedical {
    MedicalRequest medReq;

    public RequestMedical(MedicalRequest medReq) {
        this.medReq = medReq;
        
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Requesting Medical------------------");
	Connection con= DBcon.getDbcon();
	try{
	
	
        JOptionPane.showMessageDialog( null, " Request raised sucessfully for "+medReq.getVictim_email());
	System.out.println("-------------Request raised sucessfully------------------");
        stmt.close();
	con.close();
               

            } catch (SQLException e1) {
                JOptionPane.showMessageDialog( null,e1.getMessage());
            }
    }
    
    
}
