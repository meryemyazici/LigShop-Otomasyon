
package Classlar;

import javax.swing.JTextField;

public class Musteri {
    private int id;
    private String ad;
    private String soyad;
    private String eposta;
    private String parola;
    private String telefon;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
 
    @Override
    public String toString(){
        return ad + " " + soyad + " " + eposta + " " + parola + " " + telefon ;
    }
    
    
    
    
}
