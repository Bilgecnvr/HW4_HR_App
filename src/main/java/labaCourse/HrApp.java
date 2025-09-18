package labaCourse;

public class HrApp {
    public static void main(String[] args){
        //1. Departman: Yazılım
        Departman yazilim = new Departman();
        yazilim.departmanAdi = "Yazılım";

        Personel p1 = new Personel();
        p1.ad = "Beyza";
        p1.soyad = "Aydoğmuş";
        p1.pozisyon = "Kıdemli Yazılım Mühendisi";
        p1.yas = 28;
        p1.email = "beyza@sanlab.com";

        Personel p2 = new Personel();
        p2.ad = "Umut";
        p2.soyad = "Geyik";
        p2.pozisyon = "Yazılım Mühendisi";
        p2.yas = 26;
        p2.email = "umut@sanlab.com";
        yazilim.personelEkle(p1);
        yazilim.personelEkle(p2);

        //2. Departman: Gömülü Sistemler
        Departman gomulu = new Departman();
        gomulu.departmanAdi = "Gömülü Sistemler";

        Personel p3 = new Personel();
        p3.ad = "Ahmet";
        p3.soyad = "Güler";
        p3.pozisyon = "Ekip Lideri";
        p3.yas = 32;
        p3.email = "ahmet@sanlab.com";

        Personel p4 = new Personel();
        p4.ad = "Şeyma";
        p4.soyad = "Barutçu";
        p4.pozisyon = "Kıdemli Gömülü Sistemler Mühendisi";
        p4.yas = 30;
        p4.email = "seyma@sanlab.com";

        gomulu.personelEkle(p3);
        gomulu.personelEkle(p4);

        //3. Departman: Kontrol ve Test
        Departman test = new Departman();
        test.departmanAdi = "Kontrol ve Test";

        Personel p5 = new Personel();
        p5.ad = "Bilge";
        p5.soyad = "Canavar";
        p5.pozisyon = "Test Mühendisi";
        p5.yas = 27;
        p5.email = "bilge@sanlab.com";

        Personel p6 = new Personel();
        p6.ad = "Burak";
        p6.soyad = "Güzel";
        p6.pozisyon = "Kontrol Mühendisi";
        p6.yas = 27;
        p6.email = "burak@sanlab.com";

        test.personelEkle(p5);
        test.personelEkle(p6);

        //Listeleme
        yazilim.personelleriListele();
        gomulu.personelleriListele();
        test.personelleriListele();

    }
}
