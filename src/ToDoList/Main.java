package ToDoList;
import java.util.ArrayList;
import java.util.Scanner;

 class ToDoList {
    private ArrayList<String> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Geçersiz indeks!");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Görev yok.");
        } else {
            System.out.println("Görevler:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Görev ekle");
            System.out.println("2. Görev sil");
            System.out.println("3. Görevleri göster");
            System.out.println("4. Çıkış");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Dummy read to clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("Yeni görevi girin: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    System.out.println("Görev eklendi.");
                    break;
                case 2:
                    System.out.print("Silmek istediğiniz görevin indeksini girin: ");
                    int index = scanner.nextInt();
                    toDoList.removeTask(index - 1);
                    System.out.println("Görev silindi.");
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçenek!");
            }
        }
    }
}

