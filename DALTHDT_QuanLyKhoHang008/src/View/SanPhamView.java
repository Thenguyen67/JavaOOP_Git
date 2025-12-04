package View;

import Controller.SanPhamController;
import javax.swing.JOptionPane;


public class SanPhamView extends javax.swing.JFrame {

    SanPhamController sanPhamController;
    
    public SanPhamView() {
        initComponents();
        
        sanPhamController = new SanPhamController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLB_ID_SanPham = new javax.swing.JLabel();
        JLB_ID_NhaCung = new javax.swing.JLabel();
        JLB_TenSanPham = new javax.swing.JLabel();
        JLB_ID_NhanVien = new javax.swing.JLabel();
        JTF_TenSanPham = new javax.swing.JTextField();
        JTF_ID_SanPham = new javax.swing.JTextField();
        JTF_ID_NhanVien = new javax.swing.JTextField();
        JTF_ID_NhaCung = new javax.swing.JTextField();
        JBT_KiemTra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLB_ID_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLB_ID_SanPham.setText("ID SanPham");

        JLB_ID_NhaCung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLB_ID_NhaCung.setText("ID NhaCung");

        JLB_TenSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLB_TenSanPham.setText("Ten SanPham");

        JLB_ID_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLB_ID_NhanVien.setText("ID NhanVien");

        JTF_TenSanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        JTF_ID_SanPham.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JTF_ID_SanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_ID_SanPhamActionPerformed(evt);
            }
        });

        JTF_ID_NhanVien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        JTF_ID_NhaCung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        JBT_KiemTra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBT_KiemTra.setText("Kiem tra");
        JBT_KiemTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBT_KiemTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLB_TenSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLB_ID_NhaCung)
                    .addComponent(JLB_ID_SanPham)
                    .addComponent(JLB_ID_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBT_KiemTra)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JTF_ID_SanPham)
                        .addComponent(JTF_TenSanPham)
                        .addComponent(JTF_ID_NhaCung)
                        .addComponent(JTF_ID_NhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLB_ID_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_ID_SanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLB_TenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_TenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLB_ID_NhaCung, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_ID_NhaCung, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLB_ID_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_ID_NhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(JBT_KiemTra)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_ID_SanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_ID_SanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_ID_SanPhamActionPerformed

    private void JBT_KiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBT_KiemTraActionPerformed
        
        String ID_SanPham = JTF_ID_SanPham.getText();
        String TenSanPham = JTF_TenSanPham.getText();
        String ID_NhaCung = JTF_ID_NhaCung.getText();
        String ID_NhanVien = JTF_ID_NhanVien.getText();
        
        boolean check = sanPhamController.KiemTraSPTonTai(ID_SanPham, TenSanPham, ID_NhaCung, ID_NhanVien);
        
        if(!ID_SanPham.equals("") && !TenSanPham.equals("") && !ID_NhaCung.equals("") && !ID_NhanVien.equals("")){
            if(check == true){
                JOptionPane.showMessageDialog(this, "San pham co ton tai");
            }
            else {
                JOptionPane.showMessageDialog(this, "Nhap sai !", "Co loi", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Nhap sai !", "Co loi", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_JBT_KiemTraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBT_KiemTra;
    private javax.swing.JLabel JLB_ID_NhaCung;
    private javax.swing.JLabel JLB_ID_NhanVien;
    private javax.swing.JLabel JLB_ID_SanPham;
    private javax.swing.JLabel JLB_TenSanPham;
    private javax.swing.JTextField JTF_ID_NhaCung;
    private javax.swing.JTextField JTF_ID_NhanVien;
    private javax.swing.JTextField JTF_ID_SanPham;
    private javax.swing.JTextField JTF_TenSanPham;
    // End of variables declaration//GEN-END:variables
}
