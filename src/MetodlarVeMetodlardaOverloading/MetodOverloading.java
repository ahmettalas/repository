package MetodlarVeMetodlardaOverloading;

public class MetodOverloading {
    public static void main(String[] args) {
    toplama(1,2);     // version 1
    toplama(1.1,2.5); // version 2
    }
    public static void toplama(int a,int b) {
        System.out.println(a+b);
    }
    public static void toplama(double a,double b) {
        System.out.println(a+b);
    }
}
