
package Gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class loginGui extends javax.swing.JFrame {

    public loginGui() {
        initComponents();
        setTitle("LigShop : SÜPER LİG ÜRÜNLERİ");

        Dimension ekranBoyutu = Toolkit.getDefaultToolkit().getScreenSize();
        int ekranGenisligi = (int) ekranBoyutu.getWidth();
        int ekranYuksekligi = (int) ekranBoyutu.getHeight();

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        setVisible(true);
// jLabelAnaGorsel metodunu çağır
        jLabelAnaGorsel();

    }

    public void jLabelAnaGorsel() {
        // jLabel1 üzerindeki ikonu al
        Icon i = jLabelLoginGorsel.getIcon();
        // Görüntüyü ImageIcon olarak al
        ImageIcon icon = (ImageIcon) i;

        // Ekran boyutunu al
        Dimension ekranBoyutu = Toolkit.getDefaultToolkit().getScreenSize();
        int ekranGenisligi = (int) ekranBoyutu.getWidth();
        int ekranYuksekligi = (int) ekranBoyutu.getHeight();

        // ImageIcon içindeki ikonu ekran boyutuna göre ayarla
        Image image = icon.getImage().getScaledInstance(ekranGenisligi, ekranYuksekligi, Image.SCALE_SMOOTH);
        // jLabel1'e yeni ikonu ekle
        jLabelLoginGorsel.setIcon(new ImageIcon(image));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonGirisYap = new javax.swing.JButton();
        jButtonKaydol = new javax.swing.JButton();
        jLabelKarsilamaMesaji = new javax.swing.JLabel();
        jLabelLoginGorsel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,40));
        jPanel1.setForeground(new java.awt.Color(226, 219, 219));

        jButtonGirisYap.setBackground(new java.awt.Color(0, 0, 0));
        jButtonGirisYap.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jButtonGirisYap.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGirisYap.setText("ÜYE GİRİŞİ");
        jButtonGirisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGirisYapActionPerformed(evt);
            }
        });

        jButtonKaydol.setBackground(new java.awt.Color(0, 0, 0));
        jButtonKaydol.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jButtonKaydol.setForeground(new java.awt.Color(255, 255, 255));
        jButtonKaydol.setText("ÜYE OL");
        jButtonKaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKaydolActionPerformed(evt);
            }
        });

        jLabelKarsilamaMesaji.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 90)); // NOI18N
        jLabelKarsilamaMesaji.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKarsilamaMesaji.setText("LigShop'a Hos Geldiniz");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelKarsilamaMesaji)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jButtonGirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButtonKaydol, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKarsilamaMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonKaydol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 980, 210));

        jLabelLoginGorsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/login.jpg"))); // NOI18N
        getContentPane().add(jLabelLoginGorsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGirisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGirisYapActionPerformed
        loginGirisGui giris = new loginGirisGui();
        giris.setVisible(true);
        this.dispose(); // mevcut pencereyi kapat
    }//GEN-LAST:event_jButtonGirisYapActionPerformed

    private void jButtonKaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKaydolActionPerformed
        loginUyeOlGui uyeOl = new loginUyeOlGui();
        uyeOl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonKaydolActionPerformed

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
            java.util.logging.Logger.getLogger(loginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGirisYap;
    private javax.swing.JButton jButtonKaydol;
    private javax.swing.JLabel jLabelKarsilamaMesaji;
    private javax.swing.JLabel jLabelLoginGorsel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
