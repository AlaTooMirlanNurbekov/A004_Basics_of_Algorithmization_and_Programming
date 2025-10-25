import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = 7;  // fixed secret number

        System.out.print("Guess the number (between 1 and 10): ");
        int guess = sc.nextInt();

        if (guess == secret) {
            System.out.println("Correct! You guessed the number.");
        } else {
            System.out.println("Wrong! The secret number was " + secret);
        }
    }
}
