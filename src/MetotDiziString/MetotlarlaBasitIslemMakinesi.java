package MetotDiziString;
import java.util.Scanner;
public class MetotlarlaBasitIslemMakinesi {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        for(;;){
            int kullaniciSecimi = menuGoster();
            if(kullaniciSecimi == 0 ) {
                break;
            }
            System.out.println("Lütfen Birinci Sayıyı Giriniz...");
            int a = tara.nextInt();
            System.out.println("Lütfen İkinci Sayıyı Giriniz...");
            int b = tara.nextInt();

            switch (kullaniciSecimi) {
                case 1:
                    int toplam = Toplamaİslemi(a, b);
                    System.out.println("Sayıların Toplamı : " + toplam);
                    break;
                    case 2:
                        int fark = Cikartmaİslemi(a, b);
                        System.out.println("Sayıların Farkı : " + fark);
                        break;
                        case 3:
                            int carpim = Carpmaİslemi(a, b);
                            System.out.println("Sayıların Çarpımı : " + carpim);
                            break;
                            case 4:
                                int bölüm = Bölmeİslemi(a,b);
                                System.out.println("Sayıların Bölümü : " + bölüm);
                                break;
                                default:
                                    System.out.println("Hatalı Bir Sayı Tuşladınız !");
        }
        }

    }

    public static int Toplamaİslemi(int a, int b) {
       int toplam = a+b;
       return toplam;
    }
    public static int Cikartmaİslemi(int a, int b) {
        int fark = a-b;
        return fark;
    }
    public static int Carpmaİslemi(int a, int b) {
        int carpim = a*b;
        return carpim;
    }
    public static int Bölmeİslemi(int a, int b) {
        int Bölüm = a/b;
        return Bölüm;
    }


    public static int menuGoster(){
        System.out.println("********************MENU********************");
        System.out.println("Toplama işlemi için  : 1 ");
        System.out.println("Çıkartma işlemi için : 2 ");
        System.out.println("Çarpma işlemi için   : 3 ");
        System.out.println("Bölme işlemi için    : 4 ");
        System.out.println("***** CIKMAK İCİN 0 TUŞLAYINIZ *****");
        Scanner tara = new Scanner(System.in);
        int secim = tara.nextInt();
        return secim;
    }




}
