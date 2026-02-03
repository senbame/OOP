import java.util.Scanner;
public class third {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score(0 - 100): ");
        double grade = scanner.nextDouble();

        if (95 <= grade && grade <= 100){
            System.out.println('A');
        }
        else if (90 <= grade && grade <= 94){
            System.out.println("A-");
        }
        else if (85 <= grade && grade <= 89){
            System.out.println("B+");
        }
        else if (80 <= grade && grade <= 84){
            System.out.println("B");
        }
        else if (75 <= grade && grade <= 79){
            System.out.println("B-");
        }
        else if (70 <= grade && grade <= 74){
            System.out.println("C+");
        }
        else if (65 <= grade && grade <= 69){
            System.out.println("C");
        }
        else if (60 <= grade && grade <= 64){
            System.out.println("C-");
        }
        else if (55 <= grade && grade <= 59){
            System.out.println("D+");
        }
        else if (50 <= grade && grade <= 54){
            System.out.println("D");
        }
        else if (0 <= grade && grade <= 49){
            System.out.println("F");
        }
        scanner.close();
    }
}
