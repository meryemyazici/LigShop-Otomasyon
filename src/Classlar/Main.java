package Classlar;

import VeriTabani.MusteriVeritabani;
import static VeriTabani.VeriTabaniBaglantisi.baglantiAl;
import javax.swing.SwingUtilities;
import Gui.loginGui;

public class Main {

    public static void main(String[] args) {
        MusteriVeritabani.tabloOlustur();
        
        baglantiAl();
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new loginGui();
            }
        });
    }

}
