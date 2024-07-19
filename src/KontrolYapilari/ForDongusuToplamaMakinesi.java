package KontrolYapilari;

import java.util.Scanner;

public class ForDongusuToplamaMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 den kaça kadar sayıların toplamını istiyorsunuz? ");

        int KacaKadar = scanner.nextInt();
        int b = 0;

        for (int a =0 ; a<=KacaKadar ; a++ ) {

            b = b+ a;

        }

        System.out.println("Güncel Toplam : " +b);

    }
}
