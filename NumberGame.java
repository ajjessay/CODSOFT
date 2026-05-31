import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        
        int totalRoundsWon = 0;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; 
            int maxAttempts = 7; 
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nNew round started. Guess the number between 1 and 100:");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("Correct!");
                    guessedCorrectly = true;
                    totalRoundsWon++;
                    break; 
                }
                 else if (guess > randomNumber) {
                    System.out.println("Too high.");
                }
                 else {
                    System.out.println("Too low.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Out of attempts. The number was: " + randomNumber);
            }

            System.out.print("Play another round? (yes/no): ");
            String response = scanner.next().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        System.out.println("\nGame over. Total rounds won: " + totalRoundsWon);
        scanner.close();

    }
}