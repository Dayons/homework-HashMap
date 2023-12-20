import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contacts {
    public static void main(String[] args) {

        Map<String, String> contactMap = new HashMap<>();

        contactMap.put("Amir", "+996777555666");
        contactMap.put("Nurbol", "+996555656565");
        contactMap.put("Alihan", "+996556166044");

        System.out.println("Контакты:");
        for (Map.Entry<String, String> entry : contactMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите имя нового контакта: ");
        String newName = scanner.nextLine();
        System.out.print("Введите номер телефона нового контакта: ");
        String newPhoneNumber = scanner.nextLine();

        contactMap.put(newName, newPhoneNumber);

        System.out.println("\nОбновленные контакты:");
        for (Map.Entry<String, String> entry : contactMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
