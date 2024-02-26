package Classlar;
//AbstractUrun sınıfına IUrun interface sini implements ettik

abstract class AbstractUrun implements IUrun {

    private String ad;
    private double fiyat;
    private String kategori;

    //Abstract sınıfının constractoru
    public AbstractUrun(String ad, double fiyat, String kategori) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.kategori = kategori;
    }

    // IUrun interfacesinden türetilen sınıfların uygulaması gereken metotlar
    @Override
    public String getAd() {
        return ad;
    }

    @Override
    public double getFiyat() {
        return fiyat;
    }

    // İndirim uygulanmış fiyatı hesaplayan metot
    public double getIndirimliFiyat() {
        return fiyat * 0.80; // %20 indirim uygulanıyor
    }

    @Override
    public String getKategori() {
        return kategori;
    }
}
