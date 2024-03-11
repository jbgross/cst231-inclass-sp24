package wk07.wed;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Nested1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter positive size: ");
            size = in.nextInt();
        } while(size < 1);


        for(int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//        for(int i = 0; i < size*size; i++) {
//            System.out.print("* ");
//            if((i+1)%size == 0) {
//                System.out.println();
//            }
////            if((i+1) == size) {
////                System.out.println();
////                i = 0;
////            }
//        }
//        System.out.println();
        int innerCount = 0, outerCount = 0;
        while(outerCount < size) {
            while (innerCount < size) {
                System.out.print("* ");
                innerCount++;
            }
            System.out.println();
            outerCount++;
            innerCount = 0;
        }
        System.out.println();

        for(int k = 0; k < size; k++) {
            for (int i = 0; i < size - k; i++) {
                System.out.print(i + ".");
            }
            System.out.println();
        }
        System.out.println();

    }
}
