package View;

import Controller.PasswordController;
import Model.PasswordModel;
import javax.swing.JOptionPane;

public class PasswordView extends javax.swing.JFrame {

    PasswordController passwordController;
    
    public PasswordView() {
        initComponents();
        
        passwordController =  new PasswordController();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbUserIn = new javax.swing.JLabel();
        txtUserIn = new javax.swing.JTextField();
        txtPasswordIn = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        txtPasswordUp = new javax.swing.JPasswordField();
        btnSignIn = new javax.swing.JButton();
        jlbUserUp = new javax.swing.JLabel();
        jlbPasswordIn = new javax.swing.JLabel();
        txtUserUp = new javax.swing.JTextField();
        jlbPasswordUp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbUserIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbUserIn.setText("User");

        txtUserIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserInActionPerformed(evt);
            }
        });

        txtPasswordIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordInActionPerformed(evt);
            }
        });

        btnSignUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSignUp.setText("Sign up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtPasswordUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordUpActionPerformed(evt);
            }
        });

        btnSignIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSignIn.setText("Sign in");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        jlbUserUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbUserUp.setText("User");

        jlbPasswordIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbPasswordIn.setText("Password");

        txtUserUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserUpActionPerformed(evt);
            }
        });

        jlbPasswordUp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbPasswordUp.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSignIn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbUserUp, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbPasswordIn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addComponent(jlbUserIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbPasswordUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(91, 91, 91)
                                    .addComponent(btnSignUp))
                                .addComponent(txtPasswordIn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUserIn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPasswordUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUserIn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasswordIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbPasswordIn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnSignIn)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUserUp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtPasswordUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jlbPasswordUp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(btnSignUp)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserInActionPerformed

    private void txtPasswordInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String username = txtUserUp.getText();
        String password = txtPasswordUp.getText();
        
        if(!username.equals("") && !password.equals("")){
            PasswordModel pm = new PasswordModel();
            
            pm.setUsername(username);
            pm.setPassword(password);
            
            passwordController.register(pm);
            
            JOptionPane.showMessageDialog(this, "Dang ki thanh cong !");
        } else{
            JOptionPane.showMessageDialog(this, "Chua nhap du thong tin !", "Loi !", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtPasswordUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordUpActionPerformed

    private void txtUserUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserUpActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String username = txtUserIn.getText();
        String password = txtPasswordIn.getText();
        boolean check = passwordController.login(username, password);
        
        if(!username.equals("") && !password.equals("")){
            if(check == true){
                JOptionPane.showMessageDialog(this, "Dang nhap thanh cong !");
            } else{
                JOptionPane.showMessageDialog(this, "Nhap sai !", "Co loi", JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(this, "Nhap sai !", "Co loi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jlbPasswordIn;
    private javax.swing.JLabel jlbPasswordUp;
    private javax.swing.JLabel jlbUserIn;
    private javax.swing.JLabel jlbUserUp;
    private javax.swing.JPasswordField txtPasswordIn;
    private javax.swing.JPasswordField txtPasswordUp;
    private javax.swing.JTextField txtUserIn;
    private javax.swing.JTextField txtUserUp;
    // End of variables declaration//GEN-END:variables
}
