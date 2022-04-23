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
public class StaffRegistration {
     
    Staff staff;

    public StaffRegistration(Staff staff) {
        this.staff = staff;
        
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Registering Staff------------------");
	Connection con= DBcon.getDbcon();
	try{
	
	
	JOptionPane.showMessageDialog( null, staff.getName()+" Registered Sucessfully\"");
        System.out.println("-------------Registeration Successful------------------");
        stmt.close();
	con.close();
               

            } catch (SQLException e1) {
                JOptionPane.showMessageDialog( null, "Some Error Occured. Registration Unsucccessfull. Please Try After Sometime.");
            }
    }
    
    
    
}
