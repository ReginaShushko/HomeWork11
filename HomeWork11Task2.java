package homeWork11;

import java.util.Scanner;

public class HomeWork11Task2 {
    public static void main(String[] args) throws DivideByZeroException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter divisible: ");
        int divisible = scanner.nextInt();
        System.out.println("Enter divider: ");
        int divider = scanner.nextInt();

        try {
            int result  = divide(divisible, divider);
            System.out.println("Result of division: " + result);
        } catch (DivideByZeroException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Enter number once again.");
            int dividerNew = scanner.nextInt();
            int resultNew = divide(divisible, dividerNew);
            System.out.println("Result of division: " + resultNew);
        }
    }

    public static int divide(int a, int b) throws DivideByZeroException {
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            String message = "Division by zero.";
            throw new DivideByZeroException(message);
        }
    }
}

class DivideByZeroException extends Exception {

    public DivideByZeroException(String message) {
        super(message);
    }
}