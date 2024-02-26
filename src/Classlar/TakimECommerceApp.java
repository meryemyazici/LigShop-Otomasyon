package Classlar;

import Gui.TümTakimlarGui;
import Gui.loginGui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

// TakimECommerceApp sınıfı, takıma özgü ürünleri listeler ve alışveriş uygulaması sağlar.
public class TakimECommerceApp {

    private List<IUrun> urunler; // Uygulamadaki tüm ürünleri içeren liste
    /*    DefaultListModel,
    Örneğin, bir uygulamanın temel bir liste modeline ihtiyacı olduğunda
    veya kullanıcı özel bir liste modeli sağlamazsa, varsayılan bir liste modeli kullanılabilir.
     */
    private DefaultListModel<String> urunModel; // Ürünleri göstermek için kullanılan model
    private DefaultListModel<String> sepetModel; // Sepetteki ürünleri göstermek için kullanılan model
    private JComboBox<String> kategoriComboBox; // Ürünleri kategoriye göre filtrelemek için kullanılan combobox
    private String seciliTakim; // Kullanıcının seçtiği takım
    private double sepetTutari; // Sepetteki toplam tutar

    // TakimECommerceApp sınıfının yapıcı metodu
    public TakimECommerceApp(String takimAdi) {
        // Uygulamadaki tüm ürünleri içeren bir liste oluşturuluyor.
        urunler = new ArrayList<>();
        // Kullanıcının seçtiği takım adını saklamak için seciliTakim özelliği ayarlanıyor.
        seciliTakim = takimAdi;

        //SecilenUrunler classımızın Constructorden verileri Uurunler arraylistine ekliyoruz. 
        if ("Galatasaray".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Galatasaray Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Galatasaray İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Galatasaray Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Galatasaray Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Galatasaray 100. yıl Forması", 4000, "Forma"));
            urunler.add(new SecilenUrun("Galatasaray Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Galatasaray İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Galatasaray Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Galatasaray Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Galatasaray 100. yıl Şort", 3000, "Şort"));
            urunler.add(new SecilenUrun("Galatasaray Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Galatasaray  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Galatasaray Mauro Icardi Match Day T-Shirt", 2000, "T-Shirt"));
            urunler.add(new SecilenUrun("Galatasaray Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Galatasaray Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Galatasaray Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Galatasaray Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Galatasaray Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Galatasaray Aslan Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Galatasaray Baskılı Sweatshirt", 1800, "Sweathshirt"));
            // Diğer ürünleri ekle
        } else if ("Fenerbahce".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Fenerbahce Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Fenerbahce İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Fenerbahce Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Fenerbahce Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Fenerbahce 100. yıl Forması", 4000, "Forma"));
            urunler.add(new SecilenUrun("Fenerbahce Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Fenerbahce İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Fenerbahce Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Fenerbahce Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Fenerbahce 100. yıl Şort", 3000, "Şort"));
            urunler.add(new SecilenUrun("Fenerbahce Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Fenerbahce  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Fenerbahce Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Fenerbahce Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Fenerbahce Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Fenerbahce Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Fenerbahce Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Fenerbahce Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Fenerbahce Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Besiktas".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Besiktas Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Besiktas İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Besiktas Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Besiktas Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Besiktas 100. yıl Forması", 4000, "Forma"));
            urunler.add(new SecilenUrun("Besiktas Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Besiktas İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Besiktas Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Besiktas Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Besiktas  100. yıl Şort", 3000, "Şort"));
            urunler.add(new SecilenUrun("Besiktas Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Besiktas  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Besiktas Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Besiktas Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Besiktas Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Besiktas Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Besiktas Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Besiktas Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Besiktas Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Kayserispor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Kayserispor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Kayserispor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Kayserispor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Kayserispor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Kayserispor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Kayserispor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Kayserispor Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Kayserispor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Kayserispor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Kayserispor  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Kayserispor Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Kayserispor Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Kayserispor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Kayserispor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Kayserispor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Kayserispor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Kayserispor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("AdanaDemirSpor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("AdanaDemirSpor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("AdanaDemirSpor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("AdanaDemirSpor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("AdanaDemirSporKaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("AdanaDemirSpor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Trabzonspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Trabzonspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Trabzonspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Trabzonspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Trabzonspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Trabzonspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Trabzonspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Trabzonspor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Trabzonspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Trabzonspor  Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Trabzonspor  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Trabzonspor  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Trabzonspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Trabzonspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Trabzonspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Trabzonspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Trabzonspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Trabzonspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Antalyaspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Antalyaspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Antalyaspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Antalyaspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Antalyaspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Antalyaspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Antalyaspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Antalyaspor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Antalyaspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Antalyaspor  Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Antalyaspor  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Antalyaspor  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Antalyaspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Antalyaspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Antalyaspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Antalyaspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Antalyaspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Antalyaspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Kasimpasa".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Kasimpasa Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Kasimpasa İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Kasimpasa Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Kasimpasa Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Kasimpasa Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Kasimpasa İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Kasimpasa  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Kasimpasa Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Kasimpasa Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Kasimpasa  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Kasimpasa  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Kasimpasa  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Kasimpasa Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Kasimpasa Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Kasimpasa Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Kasimpasa Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Kasimpasa Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Rizespor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Rizespor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Rizespor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Rizespor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Rizespor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Rizespor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Rizespor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Rizespor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Rizespor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Rizespor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Rizespor  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Rizespor  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Rizespor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Rizespor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Rizespor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Rizespor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Rizespor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Rizespor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Hatayspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Hatayspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Hatayspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Hatayspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Hatayspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Hatayspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Hatayspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Hatayspor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Hatayspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Hatayspor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Hatayspor  Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Hatayspor  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Hatayspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Hatayspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Hatayspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Hatayspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Hatayspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Hatayspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Karagumruk".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Karagumruk Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Karagumruk İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Karagumruk Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Karagumruk Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Karagumruk Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Karagumrukİç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Karagumruk  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Karagumruk Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Karagumruk Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Karagumruk Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Karagumruk  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Karagumruk  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Karagumruk Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Karagumruk Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Karagumruk Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Karagumruk Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Karagumruk Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Sivasspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Sivasspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Sivasspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Sivasspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Sivasspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Sivasspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Sivasspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Sivasspor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Sivasspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Sivasspor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Sivasspor Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Sivasspor  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Sivasspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Sivasspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Sivasspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Sivasspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Sivasspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Sivasspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Ankaragucu".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Ankaragucu Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Ankaragucu İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Ankaragucu Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Ankaragucu Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Ankaragucu Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Ankaragucu İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Ankaragucu  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Ankaragucu Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Ankaragucu Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Ankaragucu Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Ankaragucu  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Ankaragucu  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Ankaragucu Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Ankaragucu Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Ankaragucu Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Ankaragucu Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Ankaragucu Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("GaziantepFK".equals(takimAdi)) {
            urunler.add(new SecilenUrun("GaziantepFKParçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("GaziantepFK İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("GaziantepFK Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("GaziantepFKKaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("GaziantepFK Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("GaziantepFK İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("GaziantepFK Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("GaziantepFKk Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("KGaziantepFK Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("GaziantepFK Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("GaziantepFK  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("GaziantepFK  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("GaziantepFK Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("GaziantepFK Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("GaziantepFK Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("GaziantepFK Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("GaziantepFK Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Konyaspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Konyaspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Konyaspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Konyaspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Konyaspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Konyaspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Konyaspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Konyaspor Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Konyaspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Konyaspor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Konyaspor Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Konyaspor  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Konyaspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Konyaspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Konyaspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Konyaspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Konyaspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Konyaspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Samsunspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Samsunspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Samsunspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Samsunspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Samsunspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Samsunspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Samsunspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Samsunspor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Samsunspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Samsunspor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Samsunspor Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Samsunspor Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Samsunspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Samsunspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Samsunspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Samsunspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Samsunspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Samsunspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Pendikspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Pendikspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Pendikspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Pendikspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Pendikspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Pendikspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Pendikspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Pendikspor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Pendikspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Pendikspor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Pendikspor Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Pendikspor Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Pendikspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Pendikspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Pendikspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Pendikspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Pendikspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Pendikspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Basaksehir".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Basaksehir Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Basaksehir İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Basaksehir Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Basaksehir Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Basaksehir Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Basaksehir İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Basaksehir  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Basaksehir Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Basaksehir Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Basaksehir Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Basaksehir  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Basaksehir  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Basaksehir Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Basaksehir Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Basaksehir Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Basaksehir Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Basaksehir Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Alanyaspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Alanyaspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Alanyaspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Alanyaspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Alanyaspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Alanyaspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Alanyaspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Alanyaspor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Alanyaspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Alanyaspor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Alanyaspor Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Alanyaspor  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Alanyaspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Alanyaspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Alanyaspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Alanyaspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Alanyaspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Alanyaspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        } else if ("Istanbulspor".equals(takimAdi)) {
            urunler.add(new SecilenUrun("Istanbulspor Parçalı Forması", 3000, "Forma"));
            urunler.add(new SecilenUrun("Istanbulspor İç Saha Forması", 2500, "Forma"));
            urunler.add(new SecilenUrun("Istanbulspor Deplasman Forması", 2000, "Forma"));
            urunler.add(new SecilenUrun("Istanbulspor Kaleci Forması", 1500, "Forma"));
            urunler.add(new SecilenUrun("Istanbulspor Parçalı Şort", 900, "Şort"));
            urunler.add(new SecilenUrun("Istanbulspor İç Saha Şort", 1000, "Şort"));
            urunler.add(new SecilenUrun("Istanbulspor  Deplasman Şort", 1500, "Şort"));
            urunler.add(new SecilenUrun("Istanbulspor Kaleci Şort", 500, "Şort"));
            urunler.add(new SecilenUrun("Istanbulspor Atkı", 3000, "Atkı"));
            urunler.add(new SecilenUrun("Istanbulspor Beyaz T-Shirt", 1400, "T-Shirt"));
            urunler.add(new SecilenUrun("Istanbulspor  Polar Ceket", 3000, "Ceket"));
            urunler.add(new SecilenUrun("Istanbulspor  Erkek Mont", 4000, "Mont"));
            urunler.add(new SecilenUrun("Istanbulspor Kadın Mont", 4300, "Mont"));
            urunler.add(new SecilenUrun("Istanbulspor Eşofman Takımı", 3000, "Eşofman Takımı"));
            urunler.add(new SecilenUrun("Istanbulspor Bileklik", 400, "Bileklik"));
            urunler.add(new SecilenUrun("Istanbulspor Düz Sweatshirt", 1700, "Sweathshirt"));
            urunler.add(new SecilenUrun("Istanbulspor Baskılı Sweatshirt", 1800, "Sweathshirt"));
        }

        // Diğer takımlar için gerekli kontrolleri ekleyin
        urunModel = new DefaultListModel<>();
        sepetModel = new DefaultListModel<>();

        //Combobox un içine kategorileri ekledik
        kategoriComboBox = new JComboBox<>(new String[]{"Tümü", "Forma", "Şort", "Atkı", "T-Shirt", "Sweathshirt", "Ceket", "Mont", "Eşofman Takımı", "Bileklik"});

        //kullanıcının bir kategori seçmesini takip eder ve seçilen kategoriye
        //göre belirli bir işlemi gerçekleştirir. Bu işlemi, kategoriSecildigindeGuncelle metodunun içinde belirliyoruz.
        kategoriComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //seciliTakim değişkeni ile kullanıcın seçtiği kategoriyı alır
                seciliTakim = (String) kategoriComboBox.getSelectedItem();
                kategoriSecildigindeGuncelle();
            }
        });

        sepetTutari = 0.0;
    }

    public void kategoriSecildigindeGuncelle() {
        //yeni bir kategori geldiğinde önceki kategorinin ürünlerini siliyor.
        urunModel.clear();
        for (IUrun urun : urunler) { // Tüm urunler listesinde döngü yap
            //Kategorileme kısmında seçilen takımın ya tüm ürünlerinin ya da kategorilerden birini listeler.
            if (seciliTakim.equals("Tümü") || urun.getKategori().equals(seciliTakim)) {
                //String format metodunu kullanarak bir metin şablonu oluşturuyor.Daha sonra ürünün adını,
                //normal fiaytını ,indirimli fiyatını alıp ürün bilgisini yazdırıyor.
                String urunBilgisi = String.format("%s - Orijinal Fiyat: %.2f TL, İndirimli Fiyat: %.2f TL",
                        urun.getAd(), urun.getFiyat(), ((AbstractUrun) urun).getIndirimliFiyat());
                urunModel.addElement(urunBilgisi);
            }
            else if (seciliTakim.equals("Tümü") || urun.getKategori().equals(seciliTakim)) {
                //String format metodunu kullanarak bir metin şablonu oluşturuyor.Daha sonra ürünün adını,
                //normal fiaytını ,indirimli fiyatını alıp ürün bilgisini yazdırıyor.
                String urunBilgisi = String.format("%s - Orijinal Fiyat: %.2f TL, İndirimli Fiyat: %.2f TL",
                        urun.getAd(), urun.getFiyat(), ((AbstractUrun) urun).getIndirimliFiyat());
                urunModel.addElement(urunBilgisi);}
        }
    }

    // Belirli bir takımın kategorisine göre filtrelenmiş ürünleri almak için kullanılan metot.
    private List<IUrun> filtrelenmisUrunleriAl() {
        // Filtrelenmiş ürünleri saklamak için yeni bir liste oluştur
        List<IUrun> filtrelenmisUrunler = new ArrayList<>();
        // Tüm ürünler listesinde döngü yap
        for (IUrun urun : urunler) {
            //Kategorileme kısmında seçilen takımın ya tüm ürünlerinin ya da kategorilerden birini listeler.
            if ("Tüm Kategoriler".equals(seciliTakim) || urun.getKategori().equals(seciliTakim)) {
                filtrelenmisUrunler.add(urun);//filtrelenmiş ürünleri ekliyor
            }
        }
        return filtrelenmisUrunler; //retunlada geri döndürüyor.
    }

    public void createAndShowGUI() {

        JFrame frame = new JFrame("LigShop : SÜPER LİG ÜRÜNLERİ");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ekran boyutunu al
        Dimension ekranBoyutu = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(ekranBoyutu);
        // Tam ekran yap
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Arka plan rengini koyu gri yap
        Color koyuGri = new Color(64, 64, 64);
        frame.getContentPane().setBackground(koyuGri);

        JList<String> urunListesi = new JList<>(urunModel);
        JList<String> sepetListesi = new JList<>(sepetModel);
        JButton ekleButonu = new JButton("Sepete Ekle");
        JButton cikarButonu = new JButton("Sepetten Çıkar");
        JButton odemeButonu = new JButton("Ödeme Yap");
        JButton jButtonGeri = new JButton("GERİ");

        // Buton renkleri
        ekleButonu.setBackground(new Color(192, 192, 192)); // Gümüş gri
        cikarButonu.setBackground(new Color(192, 192, 192)); // Gümüş gri
        odemeButonu.setBackground(new Color(192, 192, 192)); // Gümüş gri

        odemeButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double remainingItemsTotal = 0.0; // Sepette kalan ürünlerin toplam fiyatı

                //Sepetteki tüm ürünleri teker teker dolaşmamızı sağlıyor
                for (int i = 0; i < sepetModel.getSize(); i++) {
                    String sepetItem = sepetModel.getElementAt(i);
                    String[] parts = sepetItem.split(" - ");
                    double indirimliFiyat = Double.parseDouble(parts[1].replaceAll("[^\\d.]+", ""));

                    remainingItemsTotal += indirimliFiyat; // Sepette kalan ürünlerin toplamını güncelle
                }

                JOptionPane.showMessageDialog(null, String.format("Ödeme yapıldı. Toplam Tutar: %.2f TL", remainingItemsTotal));

                sepetModel.clear();
                // Pencereyi kapat
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                frame.dispose(); 
            }
        });

        ekleButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Seçili ürünün indeksini al
                int seciliIndeks = urunListesi.getSelectedIndex();
                if (seciliIndeks != -1) { 
                    //IUrun türündeki seçili ürün nesnesine filtrelenmiş ürünü al 
                    IUrun seciliUrun = filtrelenmisUrunleriAl().get(seciliIndeks);
                    //IUrun türündeki nesnenin indirimli fiyatını alır. 
                    double indirimliFiyat = ((AbstractUrun) seciliUrun).getIndirimliFiyat();
                    //Sepete ekliyorsun
                    sepetModel.addElement(seciliUrun.getAd() + " - " + indirimliFiyat + " TL");
                    sepetTutari += indirimliFiyat;
                }
            }
        });

        cikarButonu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Seçili ürünün indeksini al
                int seciliIndeks = sepetListesi.getSelectedIndex();
                if (seciliIndeks != -1) {
                    //Secili indisi sepetten çıkart
                    sepetModel.remove(seciliIndeks);
                }
            }
        }
        );

        JPanel panel = new JPanel(new GridLayout(1, 2));
        // Panel arka plan rengini açık gri yap
        Color acikGri = new Color(192, 192, 192);
        panel.setBackground(acikGri);
        panel.add(new JScrollPane(urunListesi));
        panel.add(new JScrollPane(sepetListesi));

        JPanel butonPaneli = new JPanel();
        // Buton paneli arka plan rengini açık gri yap
        butonPaneli.setBackground(acikGri);
        butonPaneli.add(ekleButonu);
        butonPaneli.add(cikarButonu);
        butonPaneli.add(odemeButonu);

        jButtonGeri.setFont(new java.awt.Font("Snap ITC", 1, 14));

        JPanel ustPanel = new JPanel();
        // Üst panel arka plan rengini açık gri yap
        ustPanel.setBackground(acikGri);
        ustPanel.add(new JLabel("Kategori"));
        ustPanel.add(kategoriComboBox);
        // Butonu sol üst köşeye yerleştirme işlemleri
        // Butonu sol üst köşeye yerleştirme işlemleri
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0; // x koordinatını 0 olarak ayarlayın
        gridBagConstraints.gridy = 0; // y koordinatını 0 olarak ayarlayın
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST; // köşede hizalamak için
        gridBagConstraints.insets = new Insets(10, 10, 0, 0); // Sol üst köşede 10 birim boşluk bırak

        butonPaneli.setLayout(new GridBagLayout()); // GridBagLayout kullanılacak şekilde panele layout tanımla
        ustPanel.add(jButtonGeri, gridBagConstraints);

        jButtonGeri.setFont(new java.awt.Font("Snap ITC", 1, 14));

        frame.getContentPane().add(ustPanel, BorderLayout.NORTH);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.getContentPane().add(butonPaneli, BorderLayout.SOUTH);

        frame.setVisible(true);

        // İlk açılışta kategoriye göre ürünleri listele
        kategoriSecildigindeGuncelle();

        jButtonGeri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TümTakimlarGui giris = new TümTakimlarGui();
                giris.setVisible(true);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
                frame.dispose(); // Mevcut pencereyi kapat
            }
        });
    }

    public static void main(String[] args) {
        String seciliTakimAdi = "Galatasaray"; // Burada kullanıcının seçtiği takım adını alabilirsiniz.
        TakimECommerceApp app = new TakimECommerceApp(seciliTakimAdi);
        SwingUtilities.invokeLater(() -> {
            app.createAndShowGUI();
        });
    }
}
