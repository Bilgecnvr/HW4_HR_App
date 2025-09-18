package labaCourse;

public class Departman {
    String departmanAdi;
    Personel[] personeller;
    int personelSayisi;

    Departman(){
        personeller = new Personel[30]; // En fazla 30 personel
        personelSayisi = 0;
    }

    void personelEkle(Personel p) {
        personeller[personelSayisi] = p;
        personelSayisi++;
        System.out.println(p.ad + " " + p.soyad + " " + departmanAdi + " departmanına eklendi.");

    }

    void personelleriListele(){
        System.out.println("\n " + departmanAdi + " Departmanındaki Personeller:");
        for (int i = 0; i< personelSayisi; i++) {
            personeller[i].bilgileriYazdir();;
        }
    }
}
