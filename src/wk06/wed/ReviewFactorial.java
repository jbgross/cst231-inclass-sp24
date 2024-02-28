package wk06.wed;
import java.util.*;
public class ReviewFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int base = in.nextInt();
        int factorial = 1;
        System.out.print(base + "! = ");
        for(int i = base; i > 1; i--) {
            System.out.print(i +  " * ");
            factorial = i * factorial;
        }
        System.out.println(" 1 = " + factorial);
//        int factorial = base;
//        System.out.print(base + "! = " + base + " * ");
//        for(int i = base - 1; i > 1; i--) {
//            System.out.print(i +  " * ");
//            factorial = i * factorial;
//        }
//        System.out.println("1 = " + factorial);
    }
}
