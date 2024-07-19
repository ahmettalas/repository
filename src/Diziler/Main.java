package Diziler;

public class Main {
    public static void main(String[] args) {
        int [] a  = new int[5];

        for (int i = 0; i<a.length ; i++) {
            a[i] = i+1;
            System.out.println(i+1 +". eleman : " + (i+1));
        }
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

    }



}
