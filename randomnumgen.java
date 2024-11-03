import java.util.Random;
import java.util.Scanner;

class RandomGen {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int num = rand.nextInt(100)+1;  // Generate a random number between 0 and 99
        int count = 0;
        final int MAX_ATTEMPTS = 3;   // Set the maximum number of attempts
        System.out.println("Welcom to the guess number game");
        System.out.println("Guess a number between 0 and 100");

        while (count < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            int guess = scan.nextInt();
            count++;  // Increment the attempt counter

            if (guess == num) {
                System.out.println("You guessed it right! The number was " + num);
                break;
            } else if (guess < num) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }

            if (count == MAX_ATTEMPTS) {
                System.out.println("You're out of attempts! The correct number was " + num);
            }
        }
        
    }
}
