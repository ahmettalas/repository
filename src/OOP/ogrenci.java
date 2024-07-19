package OOP;

public class ogrenci {
    int ogrenciNo;
    String isim;
    int sinif;
    boolean aktiflik;

    public ogrenci(){
       aktiflik = true;
    }

    public ogrenci(int ogrenciNo,String isim,int sinif,boolean aktiflik){
        this.ogrenciNo = ogrenciNo;
        this.isim = isim;
        this.sinif = sinif;
        this.aktiflik=aktiflik;
    }

    public void dersAl(){
        System.out.println("Öğrenci ders alıyor.");
    }

    public void ogrenciBilgileriniYazdir(){
        if(aktiflik) {
            System.out.println(" isim : " + isim + "\n sinif : " + sinif + "\n aktiflik : " + aktiflik);
        }
        else {
            System.out.println("Öğrenci kaydı aktif değildir.");
        }

    }







}
