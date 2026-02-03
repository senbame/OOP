import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int nameLength = name.length();

        System.out.print("+");
        for (int i = 0; i < nameLength; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.println("|" + name + "|");

        System.out.print("+");
        for (int i = 0; i < nameLength; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        scanner.close();
    }
        
}
