package MetodlarVeMetodlardaOverloading;

import java.util.Scanner;

public class MetodlarGiris {
    public static void main(String[] args) {
        System.out.println("Faktoriyelinin alınmasını istediğiniz sayıyı giriniz");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        faktoriyel(a);
        faktoriyel(1);
        faktoriyel(2);
        faktoriyel(3);
        faktoriyel(4);
    }


    public static void faktoriyel (int sayi) {
        int faktoriyel =1;
        while (sayi>0) {
            faktoriyel *=sayi;
            sayi--;
        }
        System.out.println("Faktoriyel = " + faktoriyel);
    }
}
