/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Service.InvestigationRequest;
import Service.InvestigationService;
import Service.MedicalTestRequest;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *  
 */
public class InvestigationDepartment extends javax.swing.JFrame {

    /**
     * Creates new form InvestigationDepartment
     */
//    public InvestigationDepartment() {
//        initComponents();
//    }
public String Iemail;
public String Ipass;
    InvestigationDepartment(String email, String password) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    initComponents();
    this.Iemail =email;
    this.Ipass =password;
    jTextField1.setText("Hi "+email);
    populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        caseResportBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        investigationDataTable = new javax.swing.JTable();
        rejectCaseBtn = new javax.swing.JButton();
        requestMedicalResults = new javax.swing.JButton();
        lblCloseAdmin = new javax.swing.JLabel();
        lblCreateTitle = new javax.swing.JLabel();
        lblAdminLogout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caseResportBtn.setBackground(new java.awt.Color(255, 153, 51));
        caseResportBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caseResportBtn.setText("Send Investigation Report");
        caseResportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseResportBtnActionPerformed(evt);
            }
        });
        jPanel1.add(caseResportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, -1, 50));

        investigationDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Case ID", "Victim Name", "Case Description", "Status"
            }
        ));
        investigationDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                investigationDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(investigationDataTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 810, 365));

        rejectCaseBtn.setBackground(new java.awt.Color(68, 168, 217));
        rejectCaseBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rejectCaseBtn.setText("Reject Case");
        rejectCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectCaseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(rejectCaseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 700, 230, 50));

        requestMedicalResults.setBackground(new java.awt.Color(255, 153, 51));
        requestMedicalResults.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestMedicalResults.setText("Request Medical Results");
        requestMedicalResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMedicalResultsActionPerformed(evt);
            }
        });
        jPanel1.add(requestMedicalResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 230, 50));

        lblCloseAdmin.setBackground(new java.awt.Color(68, 168, 217));
        lblCloseAdmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseAdmin.setText("X");
        lblCloseAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseAdminMouseClicked(evt);
            }
        });
        jPanel1.add(lblCloseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 0, 20, 30));

        lblCreateTitle.setBackground(new java.awt.Color(68, 168, 217));
        lblCreateTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCreateTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTitle.setText("INVESTIGATION DEPARTMENT PORTAL");
        lblCreateTitle.setOpaque(true);
        jPanel1.add(lblCreateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 60));

        lblAdminLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdminLogout.setForeground(new java.awt.Color(0, 51, 102));
        lblAdminLogout.setText("Logout");
        lblAdminLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(lblAdminLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 60, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/police.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 210, 280));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 102));
        jTextField1.setText("Hi MAHAK!!!");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requestMedicalResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMedicalResultsActionPerformed
        
        MedicalTestRequest medicalTestRequest = new MedicalTestRequest();
        InvestigationService investigationService = new InvestigationService();
        DefaultTableModel model = (DefaultTableModel) investigationDataTable.getModel();
        int selectedRowIndex = investigationDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        String requestId = String.valueOf(model.getValueAt(selectedRowIndex, 0));
        String victimEmail = String.valueOf(model.getValueAt(selectedRowIndex, 1));
        //enter comments for requesting medical report in dialog box
        String c = JOptionPane.showInputDialog(this, "Enter comments for Medical Report Request");
        medicalTestRequest.setRequest_Id(requestId);
        medicalTestRequest.setVictim_Email(victimEmail);
        medicalTestRequest.setNotes(c);
        //send c to Hospital Enterprise
        Boolean response = investigationService.assignRequestToHospitalManagementDepartment(medicalTestRequest);
        
        if(response == true)
        {
            JOptionPane.showMessageDialog(this, "Successfully generated test request !");
            populateTable();
            return;
        }
        JOptionPane.showMessageDialog(this, "unsuccessful !");
        return;
    }//GEN-LAST:event_requestMedicalResultsActionPerformed

    private void caseResportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseResportBtnActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) investigationDataTable.getModel();
        int selectedRowIndex = investigationDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        String requestId = String.valueOf(model.getValueAt(selectedRowIndex, 0));
        //enter comments for agency manager
        String c = JOptionPane.showInputDialog(this, "Enter Investigation Report");
        
        //send comment to Investigation Agency Management
        InvestigationService investigationService = new InvestigationService();
        Boolean response = investigationService.assignRequestToAgencyManagementDepartment(requestId, Iemail, c);
        
        if(response != null)
        {
            JOptionPane.showMessageDialog(this, "Successfully shared reports with management !");
            populateTable();
            return;
        }
        JOptionPane.showMessageDialog(this, "unsuccessful !");
        return;
    }//GEN-LAST:event_caseResportBtnActionPerformed

    private void rejectCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectCaseBtnActionPerformed
                
        //enter comments to reject
        String c = JOptionPane.showInputDialog(this, "Enter Reason for Rejection");
        
        //send rejection comment to Investigation Agency Management
    }//GEN-LAST:event_rejectCaseBtnActionPerformed

    private void investigationDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_investigationDataTableMouseClicked
        
        DefaultTableModel model = (DefaultTableModel) investigationDataTable.getModel();
        int selectedRowIndex = investigationDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        /*
        on selection check status and display relevant buttons
        assignToHospitalBtn.setVisible(true);
        assignToInvestigationBtn.setVisible(true);
        assignToLawBtn.setVisible(true);
        */        // TODO add your handling code here:
    }//GEN-LAST:event_investigationDataTableMouseClicked

    private void lblCloseAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseAdminMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_lblCloseAdminMouseClicked

    private void lblAdminLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminLogoutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Successfully Logout");
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_lblAdminLogoutMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InvestigationDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InvestigationDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InvestigationDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InvestigationDepartment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InvestigationDepartment().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton caseResportBtn;
    private javax.swing.JTable investigationDataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAdminLogout;
    private javax.swing.JLabel lblCloseAdmin;
    private javax.swing.JLabel lblCreateTitle;
    private javax.swing.JButton rejectCaseBtn;
    private javax.swing.JButton requestMedicalResults;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) investigationDataTable.getModel();
        model.setRowCount(0);
        int i = 1;
        /*
        call table with relelvant details
        
        */
        InvestigationService investigationService = new InvestigationService();
        ArrayList<InvestigationRequest> result = new ArrayList<>();
        
        result = investigationService.getInvestigationRequests(Iemail);
        
        if(result == null)
        {
            JOptionPane.showMessageDialog(null, "No Data Available");
            return;
        }
        System.out.println(result.size());
       
        for(InvestigationRequest r: result)
        {
            Object[] row = new Object[11];
            row[0] = r.getRequest_Id();
            row[1] = r.getVictim_email();
            row[2] = r.getCrime_Description();
            row[3] = r.getStatus();
            //row[4] = r.getStatus();
            
            model.addRow(row);
        }
    }
}
