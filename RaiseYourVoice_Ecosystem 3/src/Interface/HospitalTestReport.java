/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Service.HospitalService;
import Service.MedicalRequest;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *  
 */
public class HospitalTestReport extends javax.swing.JFrame {

    /**
     * Creates new form HospitalCounselor
     */
    public String email;
   public String pass;
//    public HospitalTestReport() {
//        initComponents();
//    }

    HospitalTestReport(String email, String password) {
      initComponents();
      this.email=email;
      this.pass=password;
      populateTable();

//  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        int i = 1;
        /*
        call table with relelvant details
        
        */
        HospitalService hospitalService = new HospitalService();
        ArrayList<MedicalRequest> result = new ArrayList<>();
        
        result = hospitalService.getTestAssistantMedicalRequests(email);
        
        if(result == null)
        {
            JOptionPane.showMessageDialog(null, "No Data Available");
            return;
        }
        System.out.println(result.size());
       
        for(MedicalRequest r: result)
        {
            Object[] row = new Object[11];
            row[0] = r.getRequest_Id();
            row[1] = r.getVictim_email();
            row[2] = r.getDepartment();
            row[3] = r.getAssigned_To();
            row[4] = r.getStatus();
            
            model.addRow(row);
        }
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
        lblCloseAdmin = new javax.swing.JLabel();
        lblCreateTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        btnTestDept = new javax.swing.JButton();
        lblAdminLogout = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnTestDept1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFReqId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TFAssDept = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCloseAdmin.setBackground(new java.awt.Color(68, 168, 217));
        lblCloseAdmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblCloseAdmin.setText("X");
        lblCloseAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseAdminMouseClicked(evt);
            }
        });
        jPanel1.add(lblCloseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 0, 20, 30));

        lblCreateTitle.setBackground(new java.awt.Color(68, 168, 217));
        lblCreateTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCreateTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTitle.setText("Hospital Reports Portal ");
        lblCreateTitle.setOpaque(true);
        jPanel1.add(lblCreateTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 60));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Title 2", "Title 3", "Title 4", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDetails);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 690, 300));

        btnTestDept.setBackground(new java.awt.Color(255, 153, 51));
        btnTestDept.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTestDept.setText("Share Report");
        btnTestDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestDeptActionPerformed(evt);
            }
        });
        jPanel1.add(btnTestDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 750, 230, 50));

        lblAdminLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblAdminLogout.setForeground(new java.awt.Color(0, 51, 102));
        lblAdminLogout.setText("Logout");
        lblAdminLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(lblAdminLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1470, 60, 70, 20));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 51, 102));
        jTextField1.setText("Hi MAHAK!!!");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 20));

        btnTestDept1.setBackground(new java.awt.Color(255, 153, 51));
        btnTestDept1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTestDept1.setText("Select Patient");
        jPanel1.add(btnTestDept1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 230, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Reports Description:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 140, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Request Id:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 140, 50));

        TFReqId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(TFReqId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 270, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patient Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 140, 50));

        TFAssDept.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(TFAssDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 270, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Images/LAB.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 780, 790));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, 270, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

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
//            java.util.logging.Logger.getLogger(HospitalTestReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HospitalTestReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HospitalTestReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HospitalTestReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HospitalTestReport().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFAssDept;
    private javax.swing.JTextField TFReqId;
    private javax.swing.JButton btnTestDept;
    private javax.swing.JButton btnTestDept1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAdminLogout;
    private javax.swing.JLabel lblCloseAdmin;
    private javax.swing.JLabel lblCreateTitle;
    private javax.swing.JTable tblDetails;
    // End of variables declaration//GEN-END:variables
}
