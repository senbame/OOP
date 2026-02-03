import java.util.Scanner;
public class second {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int perimeter = 2 * (a + a);
        System.out.println(perimeter);

        int area = a * a;
        System.out.println(area);

        double dia = a * Math.sqrt(2);
        System.out.println(dia);
        scanner.close();
    }
}
