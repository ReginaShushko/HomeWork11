package homeWork11;

import java.util.Scanner;

public class HomeWork11Task2 {
    public static void main(String[] args) throws DivideByZeroException {
        Scanner scanner = new Scanner(System.in);

        DivideNumbers numbers = new DivideNumbers();
        System.out.println("Enter divisible: ");
        int divisible = scanner.nextInt();

        System.out.println("Enter divider: ");

        while (true) {
            try {
                int divider = scanner.nextInt();
                System.out.println("Result of division: " + numbers.divide(divisible, divider));
                break;
            } catch (DivideByZeroException ex) {
                System.out.println("Enter divider again: ");
            }
        }
    }
}

interface Calculator {

    int divide(int a, int b) throws DivideByZeroException;
}

class DivideNumbers implements Calculator {

    @Override
    public int divide(int a, int b) throws DivideByZeroException {
        try {
            return a / b;
        } catch (ArithmeticException ex) {
            throw new DivideByZeroException();
        }
    }
}

class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super();
        System.out.println("Division by zero.");
    }
}





