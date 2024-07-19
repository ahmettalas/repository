package KontrolYapilari;

public class BreakContinueReturn {
    public static void main(String[] args) {
     /*   DisaridakiFor :
        for(int i =0; i<10 ; i++) {
            System.out.println("i'nin değeri = " +i);
        IceridekiFor:
            for(int a = 0; a<5 ; a++){
                //Break; Döngüyü sonlandırır!
                //Break komutunu başa veya sona yazmanız da sonlandırma durumunu etkiler dikkat!

                if(a==4){
                 break DisaridakiFor;
             }

                System.out.println("a'nın değeri = " + a);
                System.out.println("i'nin değeri = " + i);


            }
  }

      */
        for(int a = 0; a<5 ; a++){

            if(a==3){
                return ;   // bu "return" ifadesi metoddan çık demektir.
                // (public static void main metodu zaten 1 tane var şu an ileride birden fazla olacak)

            }

        for(int b = 0; b<5 ; b++){

            if(b==3){
                continue ;   // bu "if" ifadesinin anlamı a nın 3 olduğu durumu atla sonrasında for döngüsüne devam et!
            }
            System.out.println("a = " +a);
            System.out.println("b = " +b);

            //Break döngüyü tamamen sonlandırır continue ise bahsedilen değeri atlayarak devam eder...
            // continue ifadesininde de aynı  break gibi etiket kullanabiliriz.( "continue baslangic" gibi)
            //return ise ilgili metodu bitirir... metodlar kısmında görülecek...

        }









    }
    }
}




