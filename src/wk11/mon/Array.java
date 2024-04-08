package wk11.mon;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int x = 0; // scalar - single thing
        int [] a = new int[3]; // array or vector - multiple things
        int [] b = new int[1]; // only holds one value, but still an array
//        b = 5; // data type mismatch
        System.out.println(b);
        System.out.println(b[0]); // index 0
        b[0] = 5;
        System.out.println(b);
        System.out.println(b[0]);
        b[0] = 10;
        System.out.println(b);
        System.out.println(b[0]);

        int y = 0;
        b[y] = 15;

        Scanner in = new Scanner(System.in);

        System.out.println("Length of the array: " + a.length);
        for(int i = 0; i < a.length; i++) {
            System.out.print("enter value at index " + i + ": " );
            a[i] = in.nextInt();
        }

        for(int i = 0; i < a.length; i++) {
            System.out.println("value at index: " + i + " = " + a[i]);
        }
        System.out.println(a[0] + a[1]);

//        a = new int[1];
        a = b;
        for(int i = 0; i < a.length; i++) {
            System.out.println("value at index: " + i + " = " + a[i]);
        }
        System.out.println();


    }
}
