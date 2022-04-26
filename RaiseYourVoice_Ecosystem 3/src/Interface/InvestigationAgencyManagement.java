/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Service.InvestigationRequest;
import Service.InvestigationService;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *  
 */
public class InvestigationAgencyManagement extends javax.swing.JFrame {
public String Semail;
public String Spass;
public static String unallocatedTableName = "unallocatedInvestigationRequests";
public static String investigationTableName = "investigtationRequests";
    
    /**
     * Creates new form InvestigationAgencyManagement
     */
//    public InvestigationAgencyManagement() {
//        initComponents();
//    }

    InvestigationAgencyManagement(String email, String password) {
        this.Semail=email;
        this.Spass = password;
  initComponents();      
//throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCloseAdmin = new javax.swing.JLabel();
        lblCreateTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        allotRequestBtn = new javax.swing.JButton();
        investigationDepartmentDataBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        investigationAgencyDataTable = new javax.swing.JTable();
        allotInvestigationBtn = new javax.swing.JButton();
        shareReportToAdminBtn = new javax.swing.JButton();
        rejectCaseBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAdminLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCloseAdmin.setBackground(new java.awt.Color(68, 168, 217));
        lblCloseAdmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseAdmin.setText("X");
        lblCloseAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseAdminMouseClicked(evt);
            }
        });
        getContentPane().add(lblCloseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 0, 20, 30));

        lblCreateTitle.setBackground(new java.awt.Color(68, 168, 217));
        lblCreateTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCreateTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTitle.setText("INVESTIGATION AGENCY MANAGEMENT PORTAL");
        lblCreateTitle.setOpaque(true);
        getContentPane().add(lblCreateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allotRequestBtn.setBackground(new java.awt.Color(255, 153, 51));
        allotRequestBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allotRequestBtn.setText("Unallocated Requests");
        allotRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allotRequestBtnActionPerformed(evt);
            }
        });
        jPanel1.add(allotRequestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 230, 50));

        investigationDepartmentDataBtn.setBackground(new java.awt.Color(255, 153, 51));
        investigationDepartmentDataBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        investigationDepartmentDataBtn.setText("Investigation Department");
        investigationDepartmentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                investigationDepartmentDataBtnActionPerformed(evt);
            }
        });
        jPanel1.add(investigationDepartmentDataBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 230, 50));

        investigationAgencyDataTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Victim ID", "Victim", "Case Description", "Status"
            }
        ));
        investigationAgencyDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                investigationAgencyDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(investigationAgencyDataTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 850, 380));

        allotInvestigationBtn.setBackground(new java.awt.Color(68, 168, 217));
        allotInvestigationBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allotInvestigationBtn.setText("Allocate to Investigation Dept");
        allotInvestigationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allotInvestigationBtnActionPerformed(evt);
            }
        });
        jPanel1.add(allotInvestigationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 261, 50));

        shareReportToAdminBtn.setBackground(new java.awt.Color(68, 168, 217));
        shareReportToAdminBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shareReportToAdminBtn.setText("Share report with Raise Your Voice");
        shareReportToAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shareReportToAdminBtnActionPerformed(evt);
            }
        });
        jPanel1.add(shareReportToAdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 290, 50));

        rejectCaseBtn.setBackground(new java.awt.Color(68, 168, 217));
        rejectCaseBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rejectCaseBtn.setText("Reject Case Request");
        rejectCaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectCaseBtnActionPerformed(evt);
            }
        });
        jPanel1.add(rejectCaseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/investigate1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 80, 270, 300));

        lblAdminLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdminLogout.setForeground(new java.awt.Color(0, 51, 102));
        lblAdminLogout.setText("Logout");
        lblAdminLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(lblAdminLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 0, 70, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1550, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void investigationAgencyDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_investigationAgencyDataTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) investigationAgencyDataTable.getModel();
        int selectedRowIndex = investigationAgencyDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        /*
        
        */
    }//GEN-LAST:event_investigationAgencyDataTableMouseClicked

    private void allotInvestigationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allotInvestigationBtnActionPerformed
        // TODO add your handling code here:
        InvestigationService investigationService = new InvestigationService();
        
        DefaultTableModel model = (DefaultTableModel) investigationAgencyDataTable.getModel();
        int selectedRowIndex = investigationAgencyDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        
        String requestId = String.valueOf(model.getValueAt(selectedRowIndex, 0));
        Boolean response = investigationService.assignRequestToInvestigationDepartment(requestId);
        if(response != null)
        {
            JOptionPane.showMessageDialog(this, "Successfully Assigned to Testing Department !");
            return;
        }
        JOptionPane.showMessageDialog(this, "Invalid Department !");
        return;
    }//GEN-LAST:event_allotInvestigationBtnActionPerformed

    private void shareReportToAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shareReportToAdminBtnActionPerformed
        InvestigationService investigationService = new InvestigationService();
        
        DefaultTableModel model = (DefaultTableModel) investigationAgencyDataTable.getModel();
        int selectedRowIndex = investigationAgencyDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        
        String requestId = String.valueOf(model.getValueAt(selectedRowIndex, 0));
        
        Boolean response = investigationService.shareInvestigationReportWithRYV(requestId);
        if(response != null)
        {
            JOptionPane.showMessageDialog(this, "Successfully Assigned to RYV !");
            return;
        }
        JOptionPane.showMessageDialog(this, "UNSUCCESSFUL !");
        return;

    }//GEN-LAST:event_shareReportToAdminBtnActionPerformed

    private void rejectCaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectCaseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rejectCaseBtnActionPerformed

    private void allotRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allotRequestBtnActionPerformed
        populateTable(unallocatedTableName);
        
    }//GEN-LAST:event_allotRequestBtnActionPerformed

    private void investigationDepartmentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investigationDepartmentDataBtnActionPerformed
        populateTable(investigationTableName);
    }//GEN-LAST:event_investigationDepartmentDataBtnActionPerformed

    private void lblAdminLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminLogoutMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Successfully Logout");
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_lblAdminLogoutMouseClicked

    private void lblCloseAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseAdminMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblCloseAdminMouseClicked

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
//            java.util.logging.Logger.getLogger(InvestigationAgencyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InvestigationAgencyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InvestigationAgencyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InvestigationAgencyManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InvestigationAgencyManagement().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allotInvestigationBtn;
    private javax.swing.JButton allotRequestBtn;
    private javax.swing.JTable investigationAgencyDataTable;
    private javax.swing.JButton investigationDepartmentDataBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminLogout;
    private javax.swing.JLabel lblCloseAdmin;
    private javax.swing.JLabel lblCreateTitle;
    private javax.swing.JButton rejectCaseBtn;
    private javax.swing.JButton shareReportToAdminBtn;
    // End of variables declaration//GEN-END:variables

   
}
