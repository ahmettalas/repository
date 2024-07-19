package NesneYönelimliAtmProjesi;

public class Main {


    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("ahmettalas","123",0);
        atm.calis(hesap);

        System.out.println("Programdan çıkılıyor...");





    }
}
