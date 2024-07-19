package KontrolYapilari;

public class SwitchCaseYapisi {

    public static void main(String[] args) {
/*
        int HaftaninKacinciGunu = 4 ;

        if (HaftaninKacinciGunu == 1) {
            System.out.println("Pazartesi!");
        } else if (HaftaninKacinciGunu == 2) {
            System.out.println("Salı!");
        } else if (HaftaninKacinciGunu == 3) {
            System.out.println("Çarşamba!");
        } else if (HaftaninKacinciGunu == 4) {
            System.out.println("Perşembe!");
        } else if (HaftaninKacinciGunu == 5) {
            System.out.println("Cuma!");
        } else if (HaftaninKacinciGunu == 6) {
            System.out.println("Cumartesi!");
        } else if (HaftaninKacinciGunu == 7) {
            System.out.println("Pazar!");
        }
        else {
            System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
        }


    }
}
        BUNUN GİBİ ÇOK FAZLA ELSE İF YAPISI OLAN BİR PROJENİZ VARSA SWITCH CASE YAPISI SİZİN İÇİN DAHA UYGUN OLACAKTIR!
*/
        //SwitchCase Yapısı:
        int HaftaninKacinciGünü = 7;

        switch (HaftaninKacinciGünü) {

            case 1:
                System.out.println("Pazartesi!"); break;
            case 2:
                System.out.println("Salı!"); break;
            case 3:
                System.out.println("Çarşamba!"); break;
            case 4:
                System.out.println("Perşembe!"); break;
            case 5:
                System.out.println("Cuma!"); break;
            case 6:
                System.out.println("Cumartesi!"); break;
            case 7:
                System.out.println("Pazar!"); break;
            default:
                System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz!");

        }
        System.out.println("Switchden çıkıldı!");

    }
}










