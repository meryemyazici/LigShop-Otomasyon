/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gui;

import Classlar.Musteri;
import VeriTabani.MusteriVeritabani;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ilayd
 */
public class loginUyeOlGui extends javax.swing.JFrame {

    /**
     * Creates new form loginUyeOlGui
     */
    public loginUyeOlGui() {
        initComponents();
        setTitle("LigShop : SÜPER LİG ÜRÜNLERİ");

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

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelAd = new javax.swing.JLabel();
        jLabelSoyad = new javax.swing.JLabel();
        jLabelEposta = new javax.swing.JLabel();
        jLabelParola = new javax.swing.JLabel();
        jLabelTelefon = new javax.swing.JLabel();
        jLabelKarsilamaMesaji = new javax.swing.JLabel();
        jTextFieldSoyad = new javax.swing.JTextField();
        jTextFieldAd = new javax.swing.JTextField();
        jTextFieldTelefon = new javax.swing.JTextField();
        jTextFieldEposta = new javax.swing.JTextField();
        jPasswordFieldSifre = new javax.swing.JPasswordField();
        jCheckBoxSifreyiGoster = new javax.swing.JCheckBox();
        jButtonKaydol = new javax.swing.JButton();
        jButtonGeri = new javax.swing.JButton();
        jLabelLoginGorsel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0,0,0,80));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelAd.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelAd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAd.setText("ADI:");

        jLabelSoyad.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelSoyad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSoyad.setText("SOYADI:");
        jLabelSoyad.setPreferredSize(new java.awt.Dimension(120, 42));

        jLabelEposta.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelEposta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEposta.setText("E-POSTA ADRESİ:");

        jLabelParola.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelParola.setForeground(new java.awt.Color(255, 255, 255));
        jLabelParola.setText("PAROLA:");

        jLabelTelefon.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelTelefon.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefon.setText("TELEFON:");

        jLabelKarsilamaMesaji.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabelKarsilamaMesaji.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKarsilamaMesaji.setText("ÜYE OL");

        jTextFieldSoyad.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jTextFieldSoyad.setPreferredSize(new java.awt.Dimension(70, 42));
        jTextFieldSoyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSoyadActionPerformed(evt);
            }
        });

        jTextFieldAd.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jTextFieldAd.setPreferredSize(new java.awt.Dimension(70, 42));
        jTextFieldAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdActionPerformed(evt);
            }
        });

        jTextFieldTelefon.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jTextFieldTelefon.setPreferredSize(new java.awt.Dimension(70, 42));

        jTextFieldEposta.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jTextFieldEposta.setPreferredSize(new java.awt.Dimension(70, 42));
        jTextFieldEposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEpostaActionPerformed(evt);
            }
        });

        jPasswordFieldSifre.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N

        jCheckBoxSifreyiGoster.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxSifreyiGoster.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jCheckBoxSifreyiGoster.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSifreyiGoster.setText("Şifreyi Göster");
        jCheckBoxSifreyiGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSifreyiGosterActionPerformed(evt);
            }
        });

        jButtonKaydol.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButtonKaydol.setText("ÜYE OL");
        jButtonKaydol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKaydolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonKaydol, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabelKarsilamaMesaji, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelParola, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelEposta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelAd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelSoyad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldAd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEposta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordFieldSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jCheckBoxSifreyiGoster, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabelKarsilamaMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEposta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEposta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelParola, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxSifreyiGoster)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonKaydol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 650, 430));

        jButtonGeri.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        jButtonGeri.setText("GERİ");
        jButtonGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeriActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabelLoginGorsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/login.jpg"))); // NOI18N
        getContentPane().add(jLabelLoginGorsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1580, 930));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSoyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSoyadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSoyadActionPerformed

    private void jTextFieldAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdActionPerformed

    private void jTextFieldEpostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEpostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEpostaActionPerformed

    private void jCheckBoxSifreyiGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSifreyiGosterActionPerformed
        if (jCheckBoxSifreyiGoster.isSelected()) {//sifreyiGoster secili ise
            jPasswordFieldSifre.setEchoChar((char) 0); //secili oldugu an butun karakterleri ac
        } else { //eger secili degil ise
            jPasswordFieldSifre.setEchoChar('*'); //kullanici secmeyi birakinca sifreyi kapa
        }
    }//GEN-LAST:event_jCheckBoxSifreyiGosterActionPerformed

    private void jButtonKaydolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKaydolActionPerformed

        Musteri eklenecekMusteri = new Musteri();
        if (jTextFieldAd.getText().isEmpty() || jTextFieldSoyad.getText().isEmpty()
                || jTextFieldEposta.getText().isEmpty() || new String(jPasswordFieldSifre.getPassword()).isEmpty()
                || jTextFieldTelefon.getText().isEmpty()) {

            // Eğer bir alan boşsa, "Üye olmadınız" mesajını göster
            JOptionPane.showMessageDialog(null, "Üye olmadınız", "Hata", JOptionPane.ERROR_MESSAGE);

        } else {
            // Bilgiler boş değilse, müşteri nesnesini oluştur ve veritabanına ekle
            eklenecekMusteri.setAd(jTextFieldAd.getText());
            eklenecekMusteri.setSoyad(jTextFieldSoyad.getText());
            eklenecekMusteri.setEposta(jTextFieldEposta.getText());
            eklenecekMusteri.setParola(new String(jPasswordFieldSifre.getPassword()));
            eklenecekMusteri.setTelefon(jTextFieldTelefon.getText());

            MusteriVeritabani.ekle(eklenecekMusteri);

            // İşlem tamamlandığında başka bir mesaj göster
            JOptionPane.showMessageDialog(null, "Üye eklendi", "Başarılı", JOptionPane.INFORMATION_MESSAGE);

            loginGirisGui giris = new loginGirisGui();
            giris.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jButtonKaydolActionPerformed

    private void jButtonGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeriActionPerformed
        loginGui giris = new loginGui();
        giris.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonGeriActionPerformed

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
            java.util.logging.Logger.getLogger(loginUyeOlGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginUyeOlGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginUyeOlGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginUyeOlGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginUyeOlGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGeri;
    private javax.swing.JButton jButtonKaydol;
    private javax.swing.JCheckBox jCheckBoxSifreyiGoster;
    private javax.swing.JLabel jLabelAd;
    private javax.swing.JLabel jLabelEposta;
    private javax.swing.JLabel jLabelKarsilamaMesaji;
    private javax.swing.JLabel jLabelLoginGorsel;
    private javax.swing.JLabel jLabelParola;
    private javax.swing.JLabel jLabelSoyad;
    private javax.swing.JLabel jLabelTelefon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSifre;
    private javax.swing.JTextField jTextFieldAd;
    private javax.swing.JTextField jTextFieldEposta;
    private javax.swing.JTextField jTextFieldSoyad;
    private javax.swing.JTextField jTextFieldTelefon;
    // End of variables declaration//GEN-END:variables
}
