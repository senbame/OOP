import java.util.Scanner;
public class fourth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // D = b^2 - 4ac
        System.out.print("Enter a:");
        int a = scanner.nextInt();
        System.out.print("Enter b:");
        int b = scanner.nextInt();
        System.out.print("Enter c:");
        int c = scanner.nextInt();
        
        double d = b * b - (4.0 * a * c);
        System.out.println(d);
        if (d < 0){
            System.out.println("D is less than 0 , no roots");
        }
        else if (d == 0){
            double x = -b / (2.0 * a);
            System.out.print("X:");
            System.out.println(x);
        }
        else{
            double x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.print("X1: ");
            System.out.println(x1);
            System.out.print("X2:");
            System.out.println(x2);
        }
        scanner.close();

    }
}
