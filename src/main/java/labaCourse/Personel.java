package labaCourse;

public class Personel {

    String ad;
    String soyad;
    String pozisyon;
    int yas;
    String email;

    void bilgileriYazdir() {
        System.out.println(ad + " " + soyad + " / " + pozisyon + " / yaş: " + yas + " / email: " + email);
    }
}

