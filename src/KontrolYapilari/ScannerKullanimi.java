package KontrolYapilari;

import java.util.Scanner;

public class ScannerKullanimi {
    public static void main(String[] args) {

        System.out.println("Lütfen bir tam sayı giriniz! ");
        Scanner scanner1 = new Scanner(System.in);
        int veri = scanner1.nextInt();
        System.out.println("Girdiğiniz tam sayı : " + veri );

    }
}
