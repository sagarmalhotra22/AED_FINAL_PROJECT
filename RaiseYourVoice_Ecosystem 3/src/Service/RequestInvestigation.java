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
public class RequestInvestigation {
    InvestigationRequest invRequest;
     public void ReqInvestigation(InvestigationRequest invRequest){
     this.invRequest = invRequest;
     DBConnection DBcon = new DBConnection();
        System.out.println("-------------Requesting Investigation------------------");
	Connection con= DBcon.getDbcon();
	try{
	
	PreparedStatement stmt=con.prepareStatement("Insert into Investigation_Request(Victim_email,Culprit_Name,Crime_Description,Crime_Location,Crime_Date,Culprit_Image,Department,Assigned_To,Status,Notes,Request_Date,Update_Date,Test_Assigne) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
    
	             
        JOptionPane.showMessageDialog( null, " Request raised sucessfully for "+invRequest.getVictim_email());
	System.out.println("-------------Request raised sucessfully------------------");
        stmt.close();
	con.close();
               

            } catch (SQLException e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog( null, "Some Error Occured. Please Try After Sometime.");
            }
     }
}
