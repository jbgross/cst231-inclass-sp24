package wk02.wed;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        // faces is the number of faces (possible values) for the die
        int faces = 17;
        Random r = new Random();
//        System.out.println("hello");
        int die1 = (Math.abs(r.nextInt()) % faces) + 1;
        System.out.println("Die1: " + die1);
        int die2 = (Math.abs(r.nextInt()) % faces) + 1;
        System.out.println("Die2: " + die2);
        System.out.println("The bigger value is " + Math.max(die1, die2));
    }
}
