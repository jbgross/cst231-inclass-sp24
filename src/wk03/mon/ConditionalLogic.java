package wk03.mon;

import java.util.*;


public class ConditionalLogic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = in.nextInt();
//        System.out.println("Input is: " + (input + 5));
        if(input > 0)
        {
            System.out.println(input + " is a positive number");
        }
        else if (input < 0)
        {
            System.out.println(input + " is a negative number");
        }
        else
        {
            System.out.println(input + " is zero");
        }
//        else if(true)
//        {
//            System.out.println("whoops");
//        }
        System.out.print("Enter your name: ");
        String name = in.next();
//        if(name == "Rosa"){
        if(name.equals("Rosa")){
            System.out.println("The name is Rosa");
        }

        System.out.println("done");
        if(false) {
            System.out.println("got here now");
        }
    }
}
