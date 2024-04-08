package wk10.wed;

import java.util.Scanner;

public class Methods {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Exit? ");
//        String input = in.next();
//        if(input.equals("yes")) {
//            return;
//        }
//        System.out.print("Enter b: ");
//        int b = in.nextInt();
//        System.out.println("in main, b is equal to " + b);
//        System.out.print("Enter a: ");
////        int num2 = in.nextInt();

//        System.out.println(addTwoNumbers(b, in.nextInt()));
//        System.out.println("in main, b is equal to " + b);
//        System.out.println(addTwoNumbers(3, 4.0));
//        int x = addTwoNumbers(3.0, 4);
//        System.out.println("x is equal to " + x);
//        System.out.println(b);
//        System.out.println(foo(true));
//        System.out.println(bar());
//        bar();
    }

    public static double addTwoNumbers(double a, double b) {
        System.out.println("in the double version of addTwoNumbers");
        System.out.println("in addTwoNumbers, b is equal to " + b);
        return a + b;
    }

    public static int addTwoNumbers(int a, int b) {
//        a = 0;
//        b = 0;
        System.out.println("in the int version of addTwoNumbers");
        System.out.println("in addTwoNumbers, b is equal to " + b);
        return a + b;
    }

    public static int foo(boolean b) {
        System.out.println("inside of the foo method");
        bar();
        if(b) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void bar() {
        System.out.println("inside of the bar method");

        return;
    }

    public static void quux() {
        while(true) {
            System.out.println("hello");
        }
    }
}
