package wk03.wed;

import java.util.Scanner;

public class NestedConditional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = in.nextInt();
        if (input > 5) {
            System.out.println("big");
            if (input < 0) {
                System.out.println("negative");
            }
        } else if (input < 5) {
            System.out.println("small");
        }
        if (input < 0) {
            System.out.println("negative");
        }
        System.out.println("done");
    }
}
