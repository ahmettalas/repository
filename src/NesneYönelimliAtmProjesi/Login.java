package NesneYönelimliAtmProjesi;

import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        System.out.println("Kullanıcı Adı : ");
        kullanici_adi = scanner.nextLine();
        System.out.println("Parola : ");
        parola = scanner.nextLine();
        if (hesap.getKullaniciAdi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
            System.out.println("Başarılı bir şekilde giriş yaptınız!");
            return true;
        }
        else {
            System.out.println("Yanlış kullanıcı adı veya parola!");
            return false;
        }
    }
}