/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 *  
 */
public class AdminService {
    
    
    ArrayList<InvestigationRequest> investigationRequests = new ArrayList<InvestigationRequest>();
    ArrayList<MedicalRequest> medicalRequests = new ArrayList<MedicalRequest>();
    
    
    
    public ArrayList<AdminDataRequest> getAdminRequests()
    {
        ArrayList<AdminDataRequest> adminDataRequests = new ArrayList<AdminDataRequest>();
        ArrayList<AdminDataRequest> adminMedicalRequests = getRequests("medicalRequests", true);
        ArrayList<AdminDataRequest> adminInvestigationRequests = getRequests("investigationRequests", true);
        adminDataRequests.addAll(adminMedicalRequests);
        adminDataRequests.addAll(adminInvestigationRequests);
        System.out.println(adminMedicalRequests.size());
        System.out.println(adminInvestigationRequests.size());
        System.out.println(adminDataRequests.size());
        return adminDataRequests;
    }
    public ArrayList<AdminDataRequest> getRequests(String tableName, Boolean adminRequest)
    {
        ArrayList<AdminDataRequest> adminDataRequests = new ArrayList<AdminDataRequest>();
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
        String query = prepareQuery(tableName, 
                adminRequest ? String.valueOf(Constants.CommonOperations.GET_UNALLOCATED_REQUESTS) : 
                        String.valueOf(Constants.CommonOperations.GET_ALLOCATED_REQUESTS) );
        if(query.equals(null) || query.isBlank() || query.isEmpty())
        {
            return null;
        }
        try{
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, String.valueOf(Constants.Status.Submitted));
            //s.setString(2, String.valueOf(Constants.Status.INVESTIGATION_COMPLETE));
            if(tableName.equals("investigationRequests") && !adminRequest)
            {
                s.setString(2, String.valueOf(Constants.Status.ASSIGNED_TO_LAWYER));
                s.setString(3, String.valueOf(Constants.Status.CASE_PRESENTED));
            }
            System.out.println("-------------Fetching Records from " + tableName + "------------");
            ResultSet r = s.executeQuery();
            System.out.println("-------------Query Executed------------");
            while(r.next())
            {
                AdminDataRequest adminData = new AdminDataRequest();
                adminData.setRequestId((!r.getString("Request_Id").isBlank() || !r.getString("Request_Id").isEmpty()) ? r.getString("Request_Id") : null);
                adminData.setVictimEmail((!r.getString("Victim_email").isBlank() || !r.getString("Victim_email").isEmpty()) ? 
                        r.getString("Victim_email") : null);
                adminData.setDepartment((!r.getString("Department").isBlank() || !r.getString("Department").isEmpty()) ? 
                        r.getString("Department") : null);
                adminData.setStatus((!r.getString("Status").isBlank() || !r.getString("Status").isEmpty()) ?
                        r.getString("Status") : null);
                if(adminData.getRequestId().isBlank())
                {
                    JOptionPane.showMessageDialog(null, "No Data Available");
                    return null;
                }
                
                adminDataRequests.add(adminData);
            }
            System.out.println(adminDataRequests.size());
            s.close();
            con.close();
            return adminDataRequests;
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
            JOptionPane.showMessageDialog( null, "Some Error Occured. Data Fetch Unsucccessfull. Please Try After Sometime.");
        }
        return null;
    }

    public ArrayList<AdminDataRequest> getLawRequest()
    {
        ArrayList<AdminDataRequest> adminDataRequests = new ArrayList<AdminDataRequest>();
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
        String query = "SELECT * FROM " + Constants.investigationTableName + " WHERE Status=? OR Status=?";
        try{
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, String.valueOf(Constants.Status.ASSIGNED_TO_LAWYER));
            s.setString(2, String.valueOf(Constants.Status.CASE_PRESENTED));
            
            System.out.println("-------------Fetching Records from " + Constants.investigationTableName + "------------");
            ResultSet r = s.executeQuery();
            System.out.println("-------------Query Executed------------");
            while(r.next())
            {
                AdminDataRequest adminData = new AdminDataRequest();
                adminData.setRequestId((!r.getString("Request_Id").isBlank() || !r.getString("Request_Id").isEmpty()) ? r.getString("Request_Id") : null);
                adminData.setVictimEmail((!r.getString("Victim_email").isBlank() || !r.getString("Victim_email").isEmpty()) ? 
                        r.getString("Victim_email") : null);
                adminData.setDepartment((!r.getString("Department").isBlank() || !r.getString("Department").isEmpty()) ? 
                        r.getString("Department") : null);
                adminData.setStatus((!r.getString("Status").isBlank() || !r.getString("Status").isEmpty()) ?
                        r.getString("Status") : null);
                if(adminData.getRequestId().isBlank())
                {
                    JOptionPane.showMessageDialog(null, "No Data Available");
                    return null;
                }
                
                adminDataRequests.add(adminData);
            }
            System.out.println(adminDataRequests.size());
            s.close();
            con.close();
            return adminDataRequests;
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
            JOptionPane.showMessageDialog( null, "Some Error Occured. Data Fetch Unsucccessfull. Please Try After Sometime.");
        }
        return null;        
    }
    
    public Boolean rejectCase(String tableName, String id){
    
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
        String query = prepareQuery(tableName, String.valueOf(Constants.CommonOperations.REJECT));
        if(query.isBlank() || query.isEmpty())
        {
            return null;
        }
        try{
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, id);
            System.out.println("-------------Updating Request Status in " + tableName + "------------");
            Integer r = s.executeUpdate();
            System.out.println("-------------Query Executed------------");
            if(r==null)
            {
                JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
            }
            return true;
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
        }
        return null;
    }
    
    public Boolean assignCaseToHospital(String id){
        
        if(id==null)
            return null;
        
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
        
        String query = prepareQuery(Constants.medicalTableName, String.valueOf(Constants.AdminOperations.ASSIGN_TO_HOSPITAL));
        if(query.isBlank() || query.isEmpty())
            return null;
        
        try{
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, String.valueOf(Constants.Status.ALLOCATED_TO_HOSPITAL));
            s.setString(2, String.valueOf(Constants.Department.COUNSELLING_DEPARTMENT));
            s.setString(3, id);
            System.out.println("-------------Updating Request Status in " + Constants.medicalTableName + "------------");
            Integer r = s.executeUpdate();
            System.out.println("-------------Query Executed------------");
            if(r==null)
            {
                JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
            }
            return true;
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
        }
        return null;
    }
    
    public Boolean assignCaseToInvestigation(String id){
        
        if(id==null)
            return null;
        
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
        
        String query = prepareQuery(Constants.investigationTableName, String.valueOf(Constants.HospitalOperations.ASSIGN_TO_INVESTIGATION));
        if(query.isBlank() || query.isEmpty())
            return null;
        
        try{
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, String.valueOf(Constants.Status.ALLOCATED_TO_INVESTIGATION_MANAGEMENT));
            s.setString(2, String.valueOf(Constants.Department.INVESTIGATION_DEPARTMENT));
            s.setString(3, id);
            System.out.println("-------------Updating Request Status in " + Constants.investigationTableName + "------------");
            Integer r = s.executeUpdate();
            System.out.println("-------------Query Executed------------");
            if(r == null)
            {
                JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
            }
            return true;
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
        }
        return null;
    }
    
    public Boolean getConsentForLawFromVictim(String requestId)
    {
        if(requestId==null)
            return null;
        
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
        String query = prepareQuery(Constants.investigationTableName, String.valueOf(Constants.AdminOperations.GET_VICTIM_CONSENT));
        if(query.isBlank() || query.isEmpty())
            return null;
        
        try{
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, String.valueOf(Constants.Status.PENDING_VICTIM_CONSENT));
            s.setString(2, requestId);
            System.out.println("-------------Updating Request Status in " + Constants.investigationTableName + "------------");
            Integer r = s.executeUpdate();
            System.out.println("-------------Query Executed------------");
            if(r == null)
            {
                JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
            }
            s.close();
            con.close();
            return true;
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
        }
        return null;
    }
    
        public Boolean assignCaseToLaw(String requestId)
    {
        if(requestId==null)
            return null;
        
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
        String query = prepareQuery(Constants.investigationTableName, String.valueOf(Constants.AdminOperations.ASSIGN_TO_LAW));
        if(query.isBlank() || query.isEmpty())
            return null;
        
        try{
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, String.valueOf(Constants.Status.ASSIGNED_TO_LAWYER));
            s.setString(2, requestId);
            System.out.println("-------------Updating Request Status in " + Constants.investigationTableName + "------------");
            Integer r = s.executeUpdate();
            System.out.println("-------------Query Executed------------");
            if(r == null)
            {
                JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
            }
            return true;
        }
        catch (SQLException e1)
        {
            JOptionPane.showMessageDialog( null, "Some error occured. Status update unsucccessfull. Please try after sometime.");
        }
        return null;
    }
    
    private String prepareQuery(String tableName, String operation) {
        
        if(operation.equals(String.valueOf(Constants.AdminOperations.GET_VICTIM_CONSENT)))
        {
            return "UPDATE " + Constants.investigationTableName + " SET Status=? WHERE Request_Id=?";
        }
        if(operation.equals(String.valueOf(Constants.AdminOperations.ASSIGN_TO_LAW)))
        {
            return "UPDATE " + Constants.investigationTableName + " SET Status=? WHERE Request_Id=?";
        }
        if(operation.equals(String.valueOf(Constants.CommonOperations.GET_UNALLOCATED_REQUESTS)))
        {
            if(tableName.equals("medicalRequests"))
                return "SELECT * FROM " + Constants.medicalTableName + " WHERE Status=?";
            if(tableName.equals("investigationRequests"))
                return "SELECT * FROM " + Constants.investigationTableName + " WHERE Status=?";
        }
        if(operation.equals(String.valueOf(Constants.CommonOperations.GET_ALLOCATED_REQUESTS)))
        {
            if(tableName.equals("medicalRequests"))
                return "SELECT * FROM " + Constants.medicalTableName + " WHERE Status<>?";
            if(tableName.equals("investigationRequests") )
                return "SELECT * FROM " + Constants.investigationTableName + " WHERE Status<>? AND Status<>? AND Status<>?";
        }
        if(operation.equals(String.valueOf(Constants.CommonOperations.REJECT)))
        {
            if(tableName.equals("medicalRequests"))
            {
                return "UPDATE " + Constants.medicalTableName + " SET Status=REJECTED WHERE Request_Id=?";
            }
            if(tableName.equals("investigationRequests"))
            {
                return "UPDATE " + Constants.investigationTableName + " SET Status=REJECTED WHERE Request_Id=?";
            }
        }
        if(operation.equals(String.valueOf(Constants.AdminOperations.ASSIGN_TO_HOSPITAL)))
        {
            if(tableName.equals(Constants.medicalTableName))
            {
                return "UPDATE " + Constants.medicalTableName + " SET Status=?, Department=? WHERE Request_Id=?";
            }
        }
        if(operation.equals(String.valueOf(Constants.AdminOperations.ASSIGN_TO_INVESTIGATION)))
        {
            if(tableName.equals(Constants.investigationTableName))
            {
                return "UPDATE " + Constants.investigationTableName + " SET Status=?, Department=? WHERE Request_Id=?";
            }
        }
        return null;
    }

    public ArrayList<AdminDataRequest> getClosedRequests() {
        ArrayList<AdminDataRequest> adminDataRequests = new ArrayList<AdminDataRequest>();
        DBConnection DBcon = new DBConnection();
        System.out.println("-------------Logging In-------------");
        Connection con= DBcon.getDbcon();
        String query = "SELECT * FROM " + Constants.investigationTableName + " WHERE Status=? OR Status=?";
        String query2 =  "SELECT * FROM " + Constants.medicalTableName + " WHERE Status=?";
        try{
            PreparedStatement s = con.prepareStatement(query);
            s.setString(1, String.valueOf(Constants.Status.CASE_CLOSED));
            s.setString(2, String.valueOf(Constants.Status.INVESTIGATION_COMPLETE));
            PreparedStatement s1 = con.prepareStatement(query2);
            s1.setString(1, String.valueOf(Constants.Status.COMPLETE));
            
            System.out.println("-------------Fetching Records from " + Constants.investigationTableName + "------------");
            ResultSet r = s.executeQuery();
            ResultSet r1 = s1.executeQuery();
            System.out.println("-------------Query Executed------------");
            while(r.next())
            {
                AdminDataRequest adminData = new AdminDataRequest();
                adminData.setRequestId((!r.getString("Request_Id").isBlank() || !r.getString("Request_Id").isEmpty()) ? r.getString("Request_Id") : null);
                adminData.setVictimEmail((!r.getString("Victim_email").isBlank() || !r.getString("Victim_email").isEmpty()) ? 
                        r.getString("Victim_email") : null);
                adminData.setDepartment((!r.getString("Department").isBlank() || !r.getString("Department").isEmpty()) ? 
                        r.getString("Department") : null);
                adminData.setStatus((!r.getString("Status").isBlank() || !r.getString("Status").isEmpty()) ?
                        r.getString("Status") : null);
                if(adminData.getRequestId().isBlank())
                {
                    JOptionPane.showMessageDialog(null, "No Data Available");
                    return null;
                }
                
                adminDataRequests.add(adminData);
            }
            while(r1.next())
            {
                AdminDataRequest adminData = new AdminDataRequest();
                adminData.setRequestId((!r1.getString("Request_Id").isBlank() || !r1.getString("Request_Id").isEmpty()) ? r1.getString("Request_Id") : null);
                adminData.setVictimEmail((!r1.getString("Victim_email").isBlank() || !r1.getString("Victim_email").isEmpty()) ? 
                        r1.getString("Victim_email") : null);
                adminData.setDepartment((!r1.getString("Department").isBlank() || !r1.getString("Department").isEmpty()) ? 
                        r1.getString("Department") : null);
                adminData.setStatus((!r1.getString("Status").isBlank() || !r1.getString("Status").isEmpty()) ?
                        r1.getString("Status") : null);
                if(adminData.getRequestId().isBlank())
                {
                    JOptionPane.showMessageDialog(null, "No Data Available");
                    return null;
                }
                
                adminDataRequests.add(adminData);
            }
            System.out.println(adminDataRequests.size());
            s.close();
            s1.close();
            con.close();
            return adminDataRequests;
        }
        catch (SQLException e1)
        {
            e1.printStackTrace();
            JOptionPane.showMessageDialog( null, "Some Error Occured. Data Fetch Unsucccessfull. Please Try After Sometime.");
        }
        return null;
    }
}
