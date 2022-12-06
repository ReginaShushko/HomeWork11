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

        numbers.divide(divisible, divider);
    }
}

interface ICalculator {

    void divide(int a, int b) throws ArithmeticException;
}

class DivideNumbers implements ICalculator {

    int resultOfDivision;

    @Override
    public void divide(int a, int b) throws ArithmeticException {
        try {
            resultOfDivision = a / b;
            System.out.println("Result of division: " + resultOfDivision);

        } catch (ArithmeticException ex) {
            System.out.println("Division by zero.");
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number once again.");
                b = scanner.nextInt();
            } while (b == 0);

            int resultOfDivisionNew = a / b;
            System.out.println("Result of division: " + resultOfDivisionNew);
        }
    }
}