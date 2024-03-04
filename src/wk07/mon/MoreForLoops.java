package wk07.mon;

import java.util.*;

public class MoreForLoops {
    public static void main(String[] args) {
        // example while loop that never runs
        boolean f = false;
        while(f) {
            System.out.println("once");
        }

        // do while loop where the loop body runs once
        do {
            System.out.println("ecno");
        } while(f);

        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int k;
        for(k = 3; k > 0; --k) {
            System.out.print(k + " ");
        }
        System.out.println("Contact!");
//
//        for(Scanner s = new Scanner(System.in); k < 4; k++) {
//            System.out.print(k + " ");
//        }
        // bad code; easy to confuse
        for(; k++ < 4;) {
            System.out.print(k + " ");
        }

        // bad code - hard to understand! not using tool correctly
//        for(Scanner s = new Scanner(System.in); s.hasNextInt(); ) {
//            int input = s.nextInt();
//            System.out.println(input + 1);
//        }
//        System.out.println("done");

        Scanner in = new Scanner(System.in);
        System.out.print("Repeat how many times? ");
        int repeat = in.nextInt();
        for(int i = repeat; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("done");
        System.out.println("I repeated " + repeat + " times");

        for(int z = 0; z < 5; z++) {
            System.out.print((5 - z) + " ");
        }
//        System.out.println(i);
    }
}
