/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import Service.Login;
import javax.swing.JOptionPane;

/**
 *
 *  
 */
class MainLoginForm extends javax.swing.JFrame {

    /**
     * Creates new form MainLoginForm
     */
    Login login;
    String Counter;
    String email;
    String password;
    public MainLoginForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLeftLogin = new javax.swing.JPanel();
        lblLeft3Login = new javax.swing.JLabel();
        lblLeft1Login = new javax.swing.JLabel();
        lblLeft2Login = new javax.swing.JLabel();
        pnlRightLogin = new javax.swing.JPanel();
        txtFEmail = new javax.swing.JTextField();
        passFLogin = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        lblCloseLogin = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblForgotpswd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLeftLogin.setBackground(new java.awt.Color(68, 168, 217));
        pnlLeftLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLeft3Login.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblLeft3Login.setForeground(new java.awt.Color(255, 255, 255));
        lblLeft3Login.setText("We're Listening");
        pnlLeftLogin.add(lblLeft3Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 320, 40));

        lblLeft1Login.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        lblLeft1Login.setForeground(new java.awt.Color(255, 255, 255));
        lblLeft1Login.setText("STEP UP");
        pnlLeftLogin.add(lblLeft1Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 240, 80));

        lblLeft2Login.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        lblLeft2Login.setForeground(new java.awt.Color(255, 255, 255));
        lblLeft2Login.setText("SPEAK UP");
        pnlLeftLogin.add(lblLeft2Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 300, 70));

        getContentPane().add(pnlLeftLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 820));

        pnlRightLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlRightLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFEmail.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        txtFEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtFEmail.setText("Enter Email...");
        txtFEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFEmailActionPerformed(evt);
            }
        });
        pnlRightLogin.add(txtFEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 300, 40));

        passFLogin.setText("jPasswordField1");
        passFLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        passFLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFLoginActionPerformed(evt);
            }
        });
        pnlRightLogin.add(passFLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 300, 40));

        btnSignUp.setBackground(new java.awt.Color(255, 153, 51));
        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSignUp.setText("SignUp");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        pnlRightLogin.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 140, 60));

        btnLogin.setBackground(new java.awt.Color(255, 153, 51));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlRightLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 140, 60));

        lblCloseLogin.setBackground(new java.awt.Color(68, 168, 217));
        lblCloseLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCloseLogin.setForeground(new java.awt.Color(68, 168, 217));
        lblCloseLogin.setText("X");
        lblCloseLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseLoginMouseClicked(evt);
            }
        });
        pnlRightLogin.add(lblCloseLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 20, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Victim", "Staff" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        pnlRightLogin.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 300, 40));

        lblForgotpswd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblForgotpswd.setForeground(new java.awt.Color(0, 102, 204));
        lblForgotpswd.setText("Forgot Password?");
        lblForgotpswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgotpswdMouseClicked(evt);
            }
        });
        pnlRightLogin.add(lblForgotpswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 220, 20));

        getContentPane().add(pnlRightLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 1160, 820));

        setBounds(0, 0, 1554, 819);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFEmailActionPerformed

    private void passFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        new MainRegister().setVisible(true);
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
          //new HospitalAdmin().setVisible(true);
           try
        {   System.out.println(txtFEmail.getText()+String.valueOf(passFLogin.getPassword())+"000000000000000000000");
          
            if(txtFEmail.getText().equalsIgnoreCase("Enter Email..."))
            {
                 throw new Exception("Add Email"); 
            }
            else if(String.valueOf(passFLogin.getPassword()).equalsIgnoreCase("jPasswordField1")){
                     throw new Exception("Add password"); 
             }
            else if(jComboBox1.getSelectedItem().toString()=="Select"){
                     throw new Exception("Select User"); 
             }
            
            else{  login = new Login();
                    Counter =  login.UserLogin(txtFEmail.getText(), String.valueOf(passFLogin.getPassword()),jComboBox1.getSelectedItem().toString());
                    System.out.println(Counter);
                    
                      if(Counter==null){
                          
                          //JOptionPane.showMessageDialog(null,"Please enter valid credentials");
                          //return;
                      }
                      if(Counter.equalsIgnoreCase("Manager")){
                           email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                        new HospitalAdmin(email,password).setVisible(true);
                       }

                       else if(Counter.equalsIgnoreCase("Victim")){
                           email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new VictimReporting(email,password).setVisible(true);
                       }
                       else if(Counter.equalsIgnoreCase("Admin")){
                           
                            email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new Admin(email,password).setVisible(true);
                       }
                        else if(Counter.equalsIgnoreCase("Counselor")){
                              email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new HospitalCounselor(email,password).setVisible(true);
                       }
                        else if(Counter.equalsIgnoreCase("Superintendent")){
                               email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new InvestigationAgencyManagement(email,password).setVisible(true);
                       }
                        else if(Counter.equalsIgnoreCase("Investigator")){
                             email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new InvestigationDepartment(email,password).setVisible(true);
                       }
                      
                       else if(Counter.equalsIgnoreCase("Collector")){
                             email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new SampleCollector(email,password).setVisible(true);
                       }
                       
                       else if(Counter.equalsIgnoreCase("Assistant")){
                           email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new HospitalTestReport(email,password).setVisible(true);
                       }
                       
                       
                       else if(Counter.equalsIgnoreCase("Lawyer")){
                             email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new LawyerPortal(email,password).setVisible(true);
                       }
                       else if(Counter.equalsIgnoreCase("Judge")){

                            email=txtFEmail.getText();
                           password= String.valueOf(passFLogin.getPassword());
                          new JudgePortal(email,password).setVisible(true);
                   }
                       
                    this.dispose();

        }}
          catch(Exception e)
        {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Please enter valid credentials");
        } 
          
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblCloseLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseLoginMouseClicked
        // TODO add your handling code here:
        //System.exit(0);
        this.dispose();
        new HomePage().setVisible(true);
    }//GEN-LAST:event_lblCloseLoginMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void lblForgotpswdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgotpswdMouseClicked
        // TODO add your handling code here:
        new GetPassword().setVisible(true);
    }//GEN-LAST:event_lblForgotpswdMouseClicked

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
//            java.util.logging.Logger.getLogger(MainLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainLoginForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblCloseLogin;
    private javax.swing.JLabel lblForgotpswd;
    private javax.swing.JLabel lblLeft1Login;
    private javax.swing.JLabel lblLeft2Login;
    private javax.swing.JLabel lblLeft3Login;
    private javax.swing.JPasswordField passFLogin;
    private javax.swing.JPanel pnlLeftLogin;
    private javax.swing.JPanel pnlRightLogin;
    private javax.swing.JTextField txtFEmail;
    // End of variables declaration//GEN-END:variables
}
