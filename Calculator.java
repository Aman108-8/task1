
import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return (a + b);
    }

    public static int sub(int a, int b) {
        return (a - b);
    }

    public static int mul(int a, int b) {
        return (a * b);
    }

    public static int div(int a, int b) {
        return (a / b); // Will throw ArithmeticException if b == 0
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "Y";
        while (s.equalsIgnoreCase("Y")) {

            System.out.println("Enter first value");
            int val1 = scanner.nextInt();

            System.out.println("Enter second value");
            int val2 = scanner.nextInt();

            scanner.nextLine(); // consume leftover newline

            System.out.println("Enter an operation (+, -, *, /):");
            String ops = scanner.nextLine();

            switch (ops) {
                case "+":
                    System.out.println("Total: " + add(val1, val2));
                    break;

                case "-":
                    System.out.println("Total: " + sub(val1, val2));
                    break;

                case "*":
                    System.out.println("Total: " + mul(val1, val2));
                    break;

                case "/":
                    try {
                        System.out.println("Total: " + div(val1, val2));
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero. Please enter values again.");
                    }
                    break;

                default:
                    System.out.println("Invalid operator");
                    break;
            }

            System.out.println("Type y.....for continue");
            s = scanner.nextLine();
        }
    }
}
