package wk05.wed;

import java.util.*;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random(78);
        int max = 10;
        int secret = Math.abs(rand.nextInt()) % max + 1;
//        int secret = rand.nextInt(max) + 1;
        System.out.println("secret = " + secret);
        Scanner in = new Scanner(System.in);
        int guess = secret;
//        while(guess != secret) {
//            System.out.print("Enter a number 1 to " + max + ": ");
//            guess = in.nextInt();
//            if(guess < secret) {
//                System.out.println("Guess is too low");
//            } else if(guess > secret) {
//                System.out.println("Guess is too high");
//            }
//        }

        do {
            System.out.print("Enter a number 1 to " + max + ": ");
            guess = in.nextInt();
            if (guess < secret) {
                System.out.println("Guess is too low");
            } else if (guess > secret) {
                System.out.println("Guess is too high");
            }
        } while (guess != secret);

        System.out.println("You guessed correctly!");
    }
}
