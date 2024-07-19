package OOP;

public class ClassVeNesneKavramlari {
    public static void main(String[] args) {
        ogrenci Ahmet = new ogrenci();
        Ahmet.isim = "Ahmet Talaş";
        Ahmet.sinif = 14;
        Ahmet.ogrenciNo =921;
        Ahmet.ogrenciBilgileriniYazdir();
        // ikinci şekilde öğrenci oluşturma
        ogrenci furkan = new ogrenci(927,"Furkan",13,true);
        furkan.ogrenciBilgileriniYazdir();
        uye ahmet = new uye();
        ahmet.isim = "Ahmet Talaş";
        ahmet.yas = 22;
        ahmet.cinsiyet = "Erkek";
        ahmet.bilgileriYazdir();
    }

}
