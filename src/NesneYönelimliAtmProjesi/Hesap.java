package NesneYönelimliAtmProjesi;

public class Hesap {
    public String kullaniciAdi;
    public String parola;
    public int bakiye;


    public Hesap(String kullaniciAdi,String parola,int bakiye){

        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;

    }
    public Hesap(){
        this("Bilgi yok","Bilgi yok",0);
    }


    public void paraYatir(int tutar){
        if (tutar>=0) {
            bakiye += tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye);
        }
        else {
            System.out.println("Hatalı bir tuşlama yaptınız!");
        }
        }



    public void paraCek(int tutar) {
        if (bakiye >= tutar) {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye);
        }
        else {
            System.out.println("Yeterli Bakiyeniz bulunmamaktadır ! \n Bakiye : " +bakiye + " TL");
        }
    }

    public void setKulllaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
    public String getKullaniciAdi(){
        return kullaniciAdi;
    }
    public void setParola(String parola){
        this.parola=parola;
    }
    public String getParola(){
        return parola;
    }
    public void setBakiye(int bakiye){
        this.bakiye=bakiye;
    }
    public int getBakiye(){
        return bakiye;
    }









}
