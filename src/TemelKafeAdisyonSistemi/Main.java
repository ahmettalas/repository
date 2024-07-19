package TemelKafeAdisyonSistemi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class AdisyonSistemi {
    // Menü öğelerini ve fiyatlarını saklamak için bir Map kullanacağız
    private static Map<String, Double> menu = new HashMap<>();

    // Masaların siparişlerini saklamak için bir Map kullanacağız
    private static Map<Integer, ArrayList<String>> orders = new HashMap<>();

    public static void main(String[] args) {
        // Menüyü başlatma
        initializeMenu();

        // Kullanıcı ile etkileşim için bir Scanner oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan masayı seçmesini istiyoruz
        System.out.println("Masayı seçin (1, 2, 3):");
        int tableNumber = scanner.nextInt();

        // Masanın siparişlerini tutan bir ArrayList oluşturuyoruz
        ArrayList<String> tableOrders = new ArrayList<>();

        // Kullanıcıya menüyü gösterme
        System.out.println("Menü:");
        showMenu();

        // Kullanıcıya siparişleri almaları için menüyü kullanma
        while (true) {
            System.out.println("Sipariş eklemek için bir öğe seçin (Çıkmak için 'q' basın):");
            String item = scanner.next();

            // Kullanıcı 'q' girerse sipariş almayı durdur
            if (item.equals("q")) {
                break;
            }

            // Geçerli bir öğe mi kontrol ediyoruz
            if (menu.containsKey(item)) {
                // Siparişi masaya ekliyoruz
                tableOrders.add(item);
            } else {
                System.out.println("Geçersiz bir öğe seçtiniz.");
            }
        }

        // Masanın siparişlerini kaydediyoruz
        orders.put(tableNumber, tableOrders);

        // Masanın adisyonunu oluşturup yazdırıyoruz
        printReceipt(tableNumber);
    }

    // Menüyü başlatan yardımcı metod
    private static void initializeMenu() {
        menu.put("Kahve", 5.0);
        menu.put("Sandviç", 8.0);
        menu.put("Pasta", 6.0);
        // İhtiyaca göre menüye daha fazla öğe ekleyebilirsiniz
    }

    // Menüyü gösteren yardımcı metod
    private static void showMenu() {
        for (String item : menu.keySet()) {
            System.out.println(item + " - " + menu.get(item) + " TL");
        }
    }

    // Adisyonu yazdıran yardımcı metod
    private static void printReceipt(int tableNumber) {
        System.out.println("Adisyon - Masa " + tableNumber);
        System.out.println("------------------------------");
        System.out.println("Siparişler:");
        ArrayList<String> tableOrders = orders.get(tableNumber);
        double totalPrice = 0.0;
        for (String order : tableOrders) {
            System.out.println(order + " - " + menu.get(order) + " TL");
            totalPrice += menu.get(order);
        }
        System.out.println("Toplam: " + totalPrice + " TL");
    }
}
