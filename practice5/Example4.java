import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter expressions (e.g. 5+3 4*2):");
        String input = in.nextLine();

        String[] expressions = input.split(" ");

        for (String expr : expressions)
        {
            StringTokenizer tokenizer = new StringTokenizer(expr, "+-*/", true);

            try
            {
                String leftString  = tokenizer.nextToken();
                String operator    = tokenizer.nextToken();
                String rightString = tokenizer.nextToken();

                double leftOperand;
                double rightOperand;

                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid left operand: " + leftString);
                    continue;
                }

                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid right operand: " + rightString);
                    continue;
                }

                double result;

                switch (operator)
                {
                    case "+":
                        result = leftOperand + rightOperand;
                        break;

                    case "-":
                        result = leftOperand - rightOperand;
                        break;

                    case "*":
                        result = leftOperand * rightOperand;
                        break;

                    case "/":
                        if (rightOperand == 0)
                        {
                            System.out.println("Division by zero in: " + expr);
                            continue;
                        }
                        result = leftOperand / rightOperand;
                        break;

                    default:
                        System.out.println("Unknown operator: " + operator);
                        continue;
                }

                System.out.println(expr + " = " + result);
            }
            catch (NoSuchElementException e)
            {
                System.out.println("Invalid syntax: " + expr);
            }
        }

        in.close();
    }
}