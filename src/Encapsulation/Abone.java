package Encapsulation;
//Doğalgaz abonesi
public class Abone {

    private String isim;
    private int bakiye;
    private String sehir;

    public void dogalgaz_kullan (int miktar){
        if ( (this.bakiye -miktar) < 0 ) {
            System.out.println("Yeterli doğalgazınız yok.");
        }
        else {
            this.bakiye -=miktar;
            if (this.bakiye <=0 ) {
                System.out.println("Bakiyeniz bitmiştir.");
            }
            else {
                System.out.println( "Yeni bakiye : " +bakiye);
            }
        }
    }

    public void bakiye_ogren() {
        System.out.println("Bakiye = " + bakiye);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }













}
