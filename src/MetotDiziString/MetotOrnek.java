package MetotDiziString;
import java.util.Scanner;
public class MetotOrnek {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int kullaniciSecimi = 56;
        while (kullaniciSecimi != 0) {
            kullaniciSecimi = menuGoster();  // while döngüsünden çıkmaya ve menuGoster metodunu başlatmaya yarıyor.
            switch (kullaniciSecimi){
                case 1:
                    System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
                    int a = tara.nextInt();
                    System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
                    int b = tara.nextInt();
                    System.out.println("İki Sayının Toplamı : " + (a+b));
                    break;

                    case 2:
                    System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
                    int c = tara.nextInt();
                    System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
                    int d = tara.nextInt();
                    System.out.println("İki Sayının Farkı : " + (c-d));
                    break;
                    case 3:
                    System.out.println("Lütfen Birinci Sayıyı Giriniz : ");
                    int e = tara.nextInt();
                    System.out.println("Lütfen İkinci Sayıyı Giriniz : ");
                    int f = tara.nextInt();
                    System.out.println("İki Sayının üssü : ");
                    break;
                    default:
                    System.out.println("Hatalı Veya Yanlış Bir Veri Girdiniz...");


            }

        }




    }
    public static int menuGoster(){
        System.out.println("**********MENU*********");
        System.out.println("1  -  2 sayının toplamını bul.");
        System.out.println("2  -  2 sayının farkını bul.");
        System.out.println("3  -  2 sayının kuvvetini bul.");
        System.out.println("Çıkmak için 0 tuşlayınız ... ");
        System.out.println("*****LUTFEN BIR SECIM YAPINIZ!*****");
        Scanner tara = new Scanner(System.in);
        int secim = tara.nextInt();
        return secim;
    }
}
