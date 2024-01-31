package wk02.mon;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int d = (Math.abs(rand.nextInt())%6) + 1;
        System.out.println(d);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("name = " + name);
        System.out.print("Enter a whole number: ");
        int i1 = in.nextInt();
        System.out.print("Enter a whole number: ");
        int i2 = in.nextInt();
        System.out.println("The sum of the two numbers is "
        + (i1 + i2));
        int r = 7 % -2;
        System.out.println(r);
        int a = 7;
        int b = -2;
        double u = (1.0 * a) / ((double) b);
        System.out.println(u);
        System.out.println(a);
        boolean b1 = true;
        boolean b2 = false;
        String s1 = "hello";
        String s2;
        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
    }
}