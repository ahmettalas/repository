package Composition;

public class test {


    public static void main(String[] args) {

        Resolution cozunurluk = new Resolution(1920,1080);

        Monitor monitor1= new Monitor("Optix g24","MSI","24",cozunurluk);

        Anakart anakart1 = new Anakart("B450M-HDV","AsRock","Windows");

        Kasa kasa1 = new Kasa("Shadow Blade","Shadow","Temperli Cam");

        Bilgisayar bilgisayar1 = new Bilgisayar(monitor1,kasa1,anakart1);

        bilgisayar1.getKasa().bilgisayari_ac();

        bilgisayar1.getAnakart().isletim_sistemi_yukle("Windows 10");

        bilgisayar1.getMonitor().monitoru_kapat();

    }


}
