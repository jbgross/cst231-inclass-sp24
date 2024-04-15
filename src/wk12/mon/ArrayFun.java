package wk12.mon;

import java.util.Scanner;

public class ArrayFun {
    public static void main(String[] args) {
//        int x = 5;
//        int y = x;
//        System.out.println(x + " "  + y);
//        y = 6;
////        System.out.println(x + " "  + y);
        int [] a = null;
//        a = 5;
//        System.out.println(a);
        a = new int[2];
//        System.out.println(a);
        Scanner in = new Scanner(System.in);
//        for(int i = 0; i < a.length; i++) {
//            System.out.println("a[" + i + "]: " + a[i]);
//            System.out.print("Enter a value for index " + i + ": ");
//            a[i] = in.nextInt();
//        }

        for(int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]: " + a[i]);
        }
        int [] b = a;
        System.out.println(a + " " + b);

        a = new int[1];
//        System.out.println(a);
        System.out.println(a + " " + b);
//        for(int i = 0; i < a.length; i++) {
//            System.out.println("a[" + i + "]: " + a[i]);
//        }
//
//        System.out.println(b);
//        for(int i = 0; i < b.length; i++) {
//            System.out.println("b[" + i + "]: " + b[i]);
//        }
    }
}
