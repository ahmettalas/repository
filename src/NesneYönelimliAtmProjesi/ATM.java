package NesneYönelimliAtmProjesi;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bankamıza Hoşgeldiniz....");

        System.out.println("**********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("**********************");
        int giris_hakki = 3;
        while (true) {

            if (login.login(hesap)){
                System.out.println("Giriş başarılı...");
                break;
            }

            else {
                System.out.println("Giriş başarısız.");
                giris_hakki-=1;
                System.out.println("Kalan giriş hakkı: " +giris_hakki);
            }
            if (giris_hakki == 0){
                System.out.println("Giriş hakkınız bitmiştir.");
                return;
            }

        }
        System.out.println("***********************");
        String islemler=" 1. Bakiye Görünüle\n 2. Para Yatırma\n 3. Para Çekme\n    Çıkış için q'ya basınız";
        System.out.println(islemler);
        System.out.println("***********************");
        while(true){
            System.out.println("İşlemi seçiniz : ");
            String islem= scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("İyi günler diler,tekrar bekleriz.");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println(hesap.getBakiye());

            }
            else if (islem.equals("2")) {
                System.out.println("Lütfen yatırmak istediğiniz miktarı giriniz.");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(miktar);
                System.out.println("Başarılı bir şekilde yatırıldı. Yeni bakiye : " + hesap.getBakiye());

            }
            else if (islem.equals("3")) {
                System.out.println("Lütfen çekmek istediğiniz miktarı giriniz.");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(miktar);
            }
            else if (islem.equals("q")) {
                return;
            }
            else {
                System.out.println("Geçersiz işlem!");
            }







        }


        }
    }
