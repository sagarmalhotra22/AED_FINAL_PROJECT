/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Service.InvestigationRequest;
import Service.LawService;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *  
 */
public class JudgePortal extends javax.swing.JFrame {

    /**
     * Creates new form InvestigationDepartment
     */
   public String email;
   public String pass;
//    public JudgePortal() {
//        initComponents();
//    }

    JudgePortal(String email, String password) {
        initComponents();
       this.email=email;
        this.pass=password;
        populateTable();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        investigationDataTable = new javax.swing.JTable();
        requestMedicalResults = new javax.swing.JButton();
        lblCloseAdmin = new javax.swing.JLabel();
        lblCreateTitle = new javax.swing.JLabel();
        lblAdminLogout = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        requestMedicalResults1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        investigationDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Case ID", "Victim Email", "Case Description", "Notes", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        investigationDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                investigationDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(investigationDataTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 810, 365));

        requestMedicalResults.setBackground(new java.awt.Color(255, 153, 51));
        requestMedicalResults.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestMedicalResults.setText("Submit");
        requestMedicalResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMedicalResultsActionPerformed(evt);
            }
        });
        jPanel1.add(requestMedicalResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, 230, 50));

        lblCloseAdmin.setBackground(new java.awt.Color(68, 168, 217));
        lblCloseAdmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseAdmin.setText("X");
        lblCloseAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseAdminMouseClicked(evt);
            }
        });
        jPanel1.add(lblCloseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 20, 30));

        lblCreateTitle.setBackground(new java.awt.Color(68, 168, 217));
        lblCreateTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCreateTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTitle.setText("Judiciary Portal");
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
        jPanel1.add(lblAdminLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 60, 70, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 560, 410, 230));

        requestMedicalResults1.setBackground(new java.awt.Color(255, 153, 51));
        requestMedicalResults1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        requestMedicalResults1.setText("Send Verdict");
        requestMedicalResults1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMedicalResults1ActionPerformed(evt);
            }
        });
        jPanel1.add(requestMedicalResults1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 230, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/3bbU.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 110, 190, 190));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/judge.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 430, 410, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void requestMedicalResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMedicalResultsActionPerformed
        
        //enter comments for requesting medical report in dialog box
        DefaultTableModel model = (DefaultTableModel) investigationDataTable.getModel();
        int selectedRowIndex = investigationDataTable.getSelectedRow();
        
        if(selectedRowIndex < 0 ){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        String requestId = String.valueOf(model.getValueAt(selectedRowIndex, 0));
        String verdict = jTextArea1.getText();
        LawService lawService = new LawService();
        Boolean response = lawService.passJudgement(requestId, verdict);
        if(response == true)
        {
            JOptionPane.showMessageDialog(this, "Verdict sent");
            jTextArea1.setText("");
            populateTable();
            String email = String.valueOf(model.getValueAt(selectedRowIndex, 1));
            SendEmail obmail= new SendEmail(email, "Hi this is your verdict"+verdict);
            return;
        }
        JOptionPane.showMessageDialog(this, "Something went wrong");
        
    }//GEN-LAST:event_requestMedicalResultsActionPerformed

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

    private void requestMedicalResults1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMedicalResults1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestMedicalResults1ActionPerformed

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
//                new JudgePortal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable investigationDataTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAdminLogout;
    private javax.swing.JLabel lblCloseAdmin;
    private javax.swing.JLabel lblCreateTitle;
    private javax.swing.JButton requestMedicalResults;
    private javax.swing.JButton requestMedicalResults1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        LawService lawService = new LawService();
        ArrayList<InvestigationRequest> judgeRequests = new ArrayList<>();
        judgeRequests = lawService.getJudgeRequests();
        DefaultTableModel model = (DefaultTableModel) investigationDataTable.getModel();
        model.setRowCount(0);
        int i = 1;
        for(InvestigationRequest r: judgeRequests)
        {
            Object[] row = new Object[11];
            row[0] = r.getRequest_Id();
            row[1] = r.getVictim_email();
            row[2] = r.getCrime_Description();
            row[3] = r.getNotes();
            //row[4] = r.getNotes();
            row[4] = r.getStatus();
            
            model.addRow(row);
        }
    }
}
