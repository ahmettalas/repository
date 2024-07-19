package Algoritma;
/* - 2. kısımda her satır döndüğü sırada buna girerek satır sayısı kadar yıldız eklememeli.
- satır sayısını kontrol edip, satır sayısının 1. veya sonuncu olduğu durumda satır sayısı kadar yıldız eklemeli.
- diğer kalan satırlara ise yıldız ile başlayıp araya input -2 yıldız kadar boşluk koyup yıldız ile bitirmeli
 */
                                             //    b0 b1 b2 b3 b4
                                             // a0  *  *  *  *  *
                                             // a1  *           *
                                             // a2  *           *
                                             // a3  *           *
                                             // a4  *  *  *  *  *
import java.util.Scanner;
public class test2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        for (int a = 0 ; a < input ;a++){

            for (int b = 0 ; b < input ; b++) {
                if(b == 0 || b ==input-1 || a== 0 || a ==input-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.print("\n");
        }





    }

}
