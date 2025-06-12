import java.util.Scanner;
import java.util.Random;

 class LuckyNumberGame {
    public static void main(String[] args) {
        // Define Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Set the lucky number as a random number (between 1 and 100)
        int luckyNumber = random.nextInt(100) + 1;

        // Ask the user to make a guess
        System.out.print("I have chosen a lucky number between 1 and 100. Try to guess it!\n");

        // Declare guess variable and control flag
        int guess;
        boolean correctGuess = false;

        while (!correctGuess) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();

            if (guess == luckyNumber) {
                System.out.println("Congratulations! You guessed the lucky number.");
                correctGuess = true;
            } else if (guess < luckyNumber) {
                System.out.println("Enter a higher number.");
            } else if (guess > luckyNumber) {
                System.out.println("Enter a lower number.");
            }
        }
        //scanner nesnesini kapatalım
        scanner.close();
    }
}