import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 10;

        System.out.println("Guess a number between 1 and 100: ");
        int guess;
        do {
            guess = scanner.nextInt();
            attempts--;
            if (guess > randomNumber) {
                System.out.println("Too high, try again. You have " + attempts + " attempts left.");
            } else if (guess < randomNumber) {
                System.out.println("Too low, try again. You have " + attempts + " attempts left.");
            }
        } while (guess != randomNumber && attempts > 0);

        if (guess == randomNumber) {
            System.out.println("Yes, you guessed the number!");
        } else {
            System.out.println("Sorry, you didn't guess the number. The correct number was " + randomNumber);
        }
    }
}