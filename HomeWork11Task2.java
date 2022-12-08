package homeWork11;

import java.util.Scanner;

public class HomeWork11Task2 {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);

        DivideNumbers numbers = new DivideNumbers();
        System.out.println("Enter divisible: ");
        int divisible = scanner.nextInt();

        System.out.println("Enter divider: ");
        int divider = scanner.nextInt();

        while (true) {
            try {
                numbers.divide(divisible, divider);
                break;
            } catch (ArithmeticException ex) {
                System.out.println("Division by zero.");
            }
            System.out.println("Enter number once again.");
            divider = scanner.nextInt();
        }
    }
}

interface Calculator {

    void divide(int a, int b) throws ArithmeticException;
}

class DivideNumbers implements Calculator {

    int resultOfDivision;

    @Override
    public void divide(int a, int b) throws ArithmeticException {
        resultOfDivision = a / b;
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        System.out.println("Result of division: " + resultOfDivision);
    }
}









