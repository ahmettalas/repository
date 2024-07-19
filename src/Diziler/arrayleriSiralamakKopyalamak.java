package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class arrayleriSiralamakKopyalamak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi istersiniz?");
        int x = scanner.nextInt();
        int dizi[] = arrayiDoldur(x);
        arrayiYazdir(dizi);
        Arrays.sort(dizi);   // Diziyi Küçükten Büyüğe sıralamaya yarar.
        arrayiYazdir(dizi);
    }
    public static void arrayiYazdir(int a[]){
        for (int i = 0 ; i<a.length;i++) {
            System.out.println("Dizinin " + (i+1) +". elemanı " + a[i]);
        }
    }
    public static int[] arrayiDoldur (int sayi){
        int [] a = new int [sayi];
     Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < a.length ;i++) {
            System.out.println("Lütfen " + (i+1) + ". Elemanı Giriniz");
            a[i] = scanner.nextInt();
        }
        return a;
 }



}
