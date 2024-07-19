package MetodlarVeMetodlardaOverloading;

public class returnKullanimi {
    public static int toplama (int a,int b){
        int toplam = a+b;
        return toplam;


    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int toplam = toplama(a,b);
        System.out.println(toplam);

    }
}
