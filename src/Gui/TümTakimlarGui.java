package Gui;

import Classlar.TakimECommerceApp;
import Classlar.TakimECommerceApp;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TümTakimlarGui extends javax.swing.JFrame {

    
    public TümTakimlarGui() {
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

        jLabelAnaGorsel(); // jLabelAnaGorsel metodunu çağır
        amblemArkaPlanKaldir(); // amblemlerin arka planini kaldir fonsiyonu cagrildi


    }

    public void amblemArkaPlanKaldir() {
        jButtonGalatasaray.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonFenerbahce.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonBesiktas.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonKayserispor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonAdanaDemirSpor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonTrabzonspor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonAntalyaspor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonKasimpasa.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonRizespor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonHatayspor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonKaragumruk.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonSivasspor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonAnkaragucu.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonGaziantepFK.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonKonyaspor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonSamsunspor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonPendikspor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonBasaksehir.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonAlanyaspor.setBackground(new java.awt.Color(0, 0, 0, 0));
        jButtonIstanbulspor.setBackground(new java.awt.Color(0, 0, 0, 0));
    

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

        jButton1 = new javax.swing.JButton();
        jButtonGalatasaray = new javax.swing.JButton();
        jButtonFenerbahce = new javax.swing.JButton();
        jButtonBesiktas = new javax.swing.JButton();
        jButtonKayserispor = new javax.swing.JButton();
        jButtonAdanaDemirSpor = new javax.swing.JButton();
        jButtonTrabzonspor = new javax.swing.JButton();
        jButtonAntalyaspor = new javax.swing.JButton();
        jButtonKasimpasa = new javax.swing.JButton();
        jButtonHatayspor = new javax.swing.JButton();
        jButtonKaragumruk = new javax.swing.JButton();
        jButtonSivasspor = new javax.swing.JButton();
        jButtonAnkaragucu = new javax.swing.JButton();
        jButtonGaziantepFK = new javax.swing.JButton();
        jButtonKonyaspor = new javax.swing.JButton();
        jButtonSamsunspor = new javax.swing.JButton();
        jButtonPendikspor = new javax.swing.JButton();
        jButtonBasaksehir = new javax.swing.JButton();
        jButtonAlanyaspor = new javax.swing.JButton();
        jButtonIstanbulspor = new javax.swing.JButton();
        jButtonRizespor = new javax.swing.JButton();
        jButtonGeri = new javax.swing.JButton();
        jLabelLoginGorsel = new javax.swing.JLabel();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonGalatasaray.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/galatasaray.png"))); // NOI18N
        jButtonGalatasaray.setBorder(null);
        jButtonGalatasaray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGalatasarayActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGalatasaray, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jButtonFenerbahce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/fenerbahce.png"))); // NOI18N
        jButtonFenerbahce.setBorder(null);
        jButtonFenerbahce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFenerbahceActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFenerbahce, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 90, -1, -1));

        jButtonBesiktas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/besiktas.png"))); // NOI18N
        jButtonBesiktas.setBorder(null);
        jButtonBesiktas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBesiktasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBesiktas, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jButtonKayserispor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/kayserispor.png"))); // NOI18N
        jButtonKayserispor.setBorder(null);
        jButtonKayserispor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKayserisporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonKayserispor, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 90, -1, -1));

        jButtonAdanaDemirSpor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/adanademirspor.png"))); // NOI18N
        jButtonAdanaDemirSpor.setBorder(null);
        jButtonAdanaDemirSpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdanaDemirSporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdanaDemirSpor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 90, -1, -1));

        jButtonTrabzonspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/trabzonspor.png"))); // NOI18N
        jButtonTrabzonspor.setBorder(null);
        jButtonTrabzonspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrabzonsporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTrabzonspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jButtonAntalyaspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/antalyaspor.png"))); // NOI18N
        jButtonAntalyaspor.setToolTipText("");
        jButtonAntalyaspor.setBorder(null);
        jButtonAntalyaspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAntalyasporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAntalyaspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 260, -1, -1));

        jButtonKasimpasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/kasimpasa.png"))); // NOI18N
        jButtonKasimpasa.setToolTipText("");
        jButtonKasimpasa.setBorder(null);
        jButtonKasimpasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKasimpasaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonKasimpasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        jButtonHatayspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/hatayspor.png"))); // NOI18N
        jButtonHatayspor.setBorder(null);
        jButtonHatayspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHataysporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHatayspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, -1, -1));

        jButtonKaragumruk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/karagumruk.png"))); // NOI18N
        jButtonKaragumruk.setBorder(null);
        jButtonKaragumruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKaragumrukActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonKaragumruk, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, -1, -1));

        jButtonSivasspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/sivasspor.png"))); // NOI18N
        jButtonSivasspor.setBorder(null);
        jButtonSivasspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSivassporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSivasspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 430, -1, -1));

        jButtonAnkaragucu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/ankaragucu.png"))); // NOI18N
        jButtonAnkaragucu.setBorder(null);
        jButtonAnkaragucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnkaragucuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAnkaragucu, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        jButtonGaziantepFK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/gaziantepspor.png"))); // NOI18N
        jButtonGaziantepFK.setBorder(null);
        jButtonGaziantepFK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGaziantepFKActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGaziantepFK, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 430, -1, -1));

        jButtonKonyaspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/konyaspor.png"))); // NOI18N
        jButtonKonyaspor.setBorder(null);
        jButtonKonyaspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKonyasporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonKonyaspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, -1, -1));

        jButtonSamsunspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/samsunspor.png"))); // NOI18N
        jButtonSamsunspor.setBorder(null);
        jButtonSamsunspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSamsunsporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSamsunspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, -1, -1));

        jButtonPendikspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/pendikspor.png"))); // NOI18N
        jButtonPendikspor.setBorder(null);
        jButtonPendikspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPendiksporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPendikspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 600, -1, -1));

        jButtonBasaksehir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/basaksehir.png"))); // NOI18N
        jButtonBasaksehir.setBorder(null);
        jButtonBasaksehir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBasaksehirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBasaksehir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, -1, -1));

        jButtonAlanyaspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/alanyaspor.png"))); // NOI18N
        jButtonAlanyaspor.setBorder(null);
        jButtonAlanyaspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlanyasporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAlanyaspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 600, -1, -1));

        jButtonIstanbulspor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/istanbulspor.png"))); // NOI18N
        jButtonIstanbulspor.setBorder(null);
        jButtonIstanbulspor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIstanbulsporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIstanbulspor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 600, -1, -1));

        jButtonRizespor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/rizespor.png"))); // NOI18N
        jButtonRizespor.setBorder(null);
        jButtonRizespor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRizesporActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRizespor, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 260, -1, -1));

        jButtonGeri.setFont(new java.awt.Font("Snap ITC", 1, 14)); // NOI18N
        jButtonGeri.setText("GERİ");
        jButtonGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGeriActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGeri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabelLoginGorsel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageLogin/login.jpg"))); // NOI18N
        jLabelLoginGorsel.setText("jLabel2");
        getContentPane().add(jLabelLoginGorsel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1676, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonRizesporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRizesporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Rizespor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonRizesporActionPerformed

    private void jButtonIstanbulsporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIstanbulsporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Istanbulspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonIstanbulsporActionPerformed

    private void jButtonAlanyasporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlanyasporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Alanyaspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonAlanyasporActionPerformed

    private void jButtonBasaksehirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBasaksehirActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Basaksehir");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonBasaksehirActionPerformed

    private void jButtonPendiksporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPendiksporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Pendikspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonPendiksporActionPerformed

    private void jButtonSamsunsporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSamsunsporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Samsunspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonSamsunsporActionPerformed

    private void jButtonKonyasporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKonyasporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Konyaspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonKonyasporActionPerformed

    private void jButtonGaziantepFKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGaziantepFKActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("GaziantepFK");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonGaziantepFKActionPerformed

    private void jButtonAnkaragucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnkaragucuActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Ankaragucu");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonAnkaragucuActionPerformed

    private void jButtonSivassporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSivassporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Sivasspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonSivassporActionPerformed

    private void jButtonKaragumrukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKaragumrukActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Karagumruk");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonKaragumrukActionPerformed

    private void jButtonHataysporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHataysporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Hatayspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonHataysporActionPerformed

    private void jButtonKasimpasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKasimpasaActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Kasimpasa");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonKasimpasaActionPerformed

    private void jButtonAntalyasporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAntalyasporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Antalyaspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonAntalyasporActionPerformed

    private void jButtonTrabzonsporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrabzonsporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Trabzonspor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonTrabzonsporActionPerformed

    private void jButtonAdanaDemirSporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdanaDemirSporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("AdanaDemirSpor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonAdanaDemirSporActionPerformed

    private void jButtonKayserisporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKayserisporActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Kayserispor");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonKayserisporActionPerformed

    private void jButtonBesiktasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBesiktasActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Besiktas");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonBesiktasActionPerformed

    private void jButtonFenerbahceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFenerbahceActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Fenerbahce");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonFenerbahceActionPerformed

    private void jButtonGalatasarayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGalatasarayActionPerformed
        TakimECommerceApp takimApp = new TakimECommerceApp("Galatasaray");
        SwingUtilities.invokeLater(takimApp::createAndShowGUI);
        this.dispose();
    }//GEN-LAST:event_jButtonGalatasarayActionPerformed

    private void jButtonGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGeriActionPerformed
        loginGui giris = new loginGui();
            giris.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButtonGeriActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TümTakimlarGui().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdanaDemirSpor;
    private javax.swing.JButton jButtonAlanyaspor;
    private javax.swing.JButton jButtonAnkaragucu;
    private javax.swing.JButton jButtonAntalyaspor;
    private javax.swing.JButton jButtonBasaksehir;
    private javax.swing.JButton jButtonBesiktas;
    private javax.swing.JButton jButtonFenerbahce;
    private javax.swing.JButton jButtonGalatasaray;
    private javax.swing.JButton jButtonGaziantepFK;
    private javax.swing.JButton jButtonGeri;
    private javax.swing.JButton jButtonHatayspor;
    private javax.swing.JButton jButtonIstanbulspor;
    private javax.swing.JButton jButtonKaragumruk;
    private javax.swing.JButton jButtonKasimpasa;
    private javax.swing.JButton jButtonKayserispor;
    private javax.swing.JButton jButtonKonyaspor;
    private javax.swing.JButton jButtonPendikspor;
    private javax.swing.JButton jButtonRizespor;
    private javax.swing.JButton jButtonSamsunspor;
    private javax.swing.JButton jButtonSivasspor;
    private javax.swing.JButton jButtonTrabzonspor;
    private javax.swing.JLabel jLabelLoginGorsel;
    // End of variables declaration//GEN-END:variables
}
