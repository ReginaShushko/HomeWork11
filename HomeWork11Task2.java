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
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if (divider == 0) {
                System.out.println("Enter number once again.");
                divider = scanner.nextInt();
            } else {
                break;
            }
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
        try {
            resultOfDivision = a / b;
            System.out.println("Result of division: " + resultOfDivision);

        } catch (ArithmeticException ex) {
            System.out.println("Division by zero.");
        }
    }
}




