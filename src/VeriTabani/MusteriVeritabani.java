package VeriTabani;
import java.sql.*;
import Classlar.Musteri;
import static VeriTabani.VeriTabaniBaglantisi.baglantiAl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MusteriVeritabani extends VeriTabaniBaglantisi {

    public static void tabloOlustur() {
        Connection conn = baglantiAl();
        try {
            PreparedStatement sorgu = conn.prepareStatement(
                    "CREATE TABLE musteri ("
                    + "id INT IDENTITY(1,1) PRIMARY KEY,"
                    + "ad VARCHAR(50) NOT NULL,"
                    + "soyad VARCHAR(50) NOT NULL,"
                    + "eposta VARCHAR(50) NOT NULL,"
                    + "parola VARCHAR(50) NOT NULL,"
                    + "telefon VARCHAR(50) NOT NULL)"
            );

            sorgu.executeUpdate();

            sorgu.close();
            conn.close();

        } catch (SQLException e) {
            // e.printStackTrace();
            System.out.println("Kullanici tablosu zaten var");
        }

    }

    public static void ekle(Musteri eklenecekMusteri) {
        Connection conn = baglantiAl();
        try {
            PreparedStatement sorgu = conn.prepareStatement(
                    "INSERT INTO musteri(ad,soyad,eposta,parola,telefon) VALUES(?,?,?,?,?)");
            sorgu.setString(1, eklenecekMusteri.getAd());
            sorgu.setString(2, eklenecekMusteri.getSoyad());
            sorgu.setString(3, eklenecekMusteri.getEposta());
            sorgu.setString(4, eklenecekMusteri.getParola());
            sorgu.setString(5, eklenecekMusteri.getTelefon());

            sorgu.executeUpdate();

            sorgu.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Kullanici tablosu zaten var");
        }

    }

    public static boolean kontrol(String eposta, String parola) {
        boolean sonuc = false;

        Connection conn = baglantiAl();

        try {
            PreparedStatement sorgu = conn.prepareStatement("SELECT * FROM musteri WHERE eposta =? AND parola = ?");
            sorgu.setString(1,eposta);
            sorgu.setString(2,parola);
            
         ResultSet rs = sorgu.executeQuery();
            
         while(rs.next()){ //bir sonuc donuyorsa
             sonuc=true;
             
         }
            
        sorgu.close();
        conn.close();     
        } catch (SQLException ex) {
            Logger.getLogger(MusteriVeritabani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sonuc;

    }
public static String sifreGetir(String eposta) {
        Connection conn = baglantiAl();
        String sifre = null;

        try {
            //Bu SQL sorgusu, bir veritabanındaki "musteri" tablosundan, belirli bir e-posta adresine sahip olan müşterinin şifresini getirir.
            PreparedStatement sorgu = conn.prepareStatement("SELECT parola FROM musteri WHERE eposta = ?");
            sorgu.setString(1, eposta);

            ResultSet rs = sorgu.executeQuery();

            if (rs.next()) {
                // Eğer e-posta bulunursa, şifreyi al
                sifre = rs.getString("parola");
            }

            sorgu.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MusteriVeritabani.class.getName()).log(Level.SEVERE, null, ex);
        }

        return sifre;
    }

}
