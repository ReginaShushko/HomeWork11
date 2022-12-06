package homeWork11;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HomeWork11Task1 {
    public static void main(String[] args) {
        System.out.println("Guess number in range from 1 to 100.");
        Random random = new Random();
        int numberToGuess = random.nextInt(99) + 1;

        Scanner scanner = new Scanner(System.in);

        int countTry = 0;
        int userNumber = 0;
        do {
            countTry++;
            System.out.print("Enter number: ");
            try {
                userNumber = scanner.nextInt();
                if (userNumber > numberToGuess) {
                    System.out.println("The hidden number is less.");
                } else if (userNumber < numberToGuess) {
                    System.out.println("The hidden number is greater.");
                } else System.out.println("You guessed right!");
            } catch (InputMismatchException ex) {
                System.out.println("Input error. Enter number.");
                scanner.next();
            }
        }
        while
        (userNumber != numberToGuess);
        System.out.println("Attempts: " + countTry);
    }
}

