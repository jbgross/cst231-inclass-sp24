package wk04.mon;

import java.util.*;

public class LoopFun {
    public static void main(String[] args) {
        int x = 0;
        Scanner in = new Scanner(System.in);
//        System.out.println(password);
        String password = "";
        int iterations = 0;
//        while (!password.toLowerCase().equalsIgnoreCase("hello".toLowerCase())) {
        while (!password.equalsIgnoreCase("hello")) {
            iterations++;
            System.out.print("Enter the password: ");
            password = in.next();
        }
        System.out.println("It took " +
                iterations +
                " iterations for you to enter the password correctly");

//        if("hello".equals(password)) {
        if (!password.equalsIgnoreCase("hello")) {
            System.out.println("matches!");
        } else {
            System.out.println("wrong");

        }
//        while(x < 10) {
////            if(x >= 10) {
////                break;
////            }
//            System.out.println(x);
//            x++;
//        }
        System.out.println("done!");
//        while(true) {
//            System.out.print("\thello");
//        }

    }
}
