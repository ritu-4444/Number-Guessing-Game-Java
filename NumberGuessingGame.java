import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // random number between 1–100
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessed = false;

        System.out.println("===== Welcome to Number Guessing Game =====");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it!");

        while (!hasGuessed) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessed = true;
                System.out.println("🎉 Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }

        System.out.println("===== Game Over =====");
        sc.close();
    }
}
