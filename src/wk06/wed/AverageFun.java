package wk06.wed;
import java.util.*;
public class AverageFun {
    public static void main(String[] args) {
        int input = 1, count = 0;
        double sum = 0;
        Scanner in = new Scanner(System.in);
        while(input != 0) {
            System.out.print("Enter a number or zero to stop: ");
            input = in.nextInt();
            sum = input + sum; // sum += input;
            count++;
//            if(input != 0) {
//                count++;
//            }
        }
        count--;

        System.out.println("average of " + count
                        + " numbers is "
                        + sum/count);
    }
}
