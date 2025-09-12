import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to Number Guessing Game!");

        while (playAgain) {
            System.out.println("Select Difficulty Level:");
            System.out.println("1. Easy (10 attempts)");
            System.out.println("2. Medium (7 attempts)");
            System.out.println("3. Hard (5 attempts)");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            int maxAttempts;
            switch (choice) {
                case 1:
                    maxAttempts = 10;
                    break;
                case 2:
                    maxAttempts = 7;
                    break;
                case 3:
                    maxAttempts = 5;
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to Medium.");
                    maxAttempts = 7;
                    break;
            }

            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            boolean guessed = false;

            System.out.println("I have chosen a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            // game loop
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    guessed = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Attempts left: " + (maxAttempts - attempts));
                } else {
                    System.out.println("Too high! Attempts left: " + (maxAttempts - attempts));
                }
            }

            if (!guessed) {
                System.out.println("Game Over! The correct number was " + numberToGuess);
            }

            int score = guessed ? (maxAttempts - attempts + 1) * 10 : 0;
            System.out.println("Your Score: " + score);

            // replay option
            System.out.print("Do you want to play again? (yes/no): ");
            String again = sc.next().toLowerCase();
            playAgain = again.equals("yes");
        }

        System.out.println("Thanks for playing!");
        sc.close();
        
    }
} 