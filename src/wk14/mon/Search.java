package wk14.mon;

import java.util.*;

public class Search {

    public static void main(String[] args) {
        int [] a = {12, 17, 2, -9, 4, 1, -29, 6, 17};
        System.out.println(isSorted(a));
        Arrays.sort(a);
        System.out.println(isSorted(a));
        int input;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter a number (negative to end): ");
            input = in.nextInt();
            String inputString = in.next();
            String [] names = {};
            System.out.println(linearSearch(names, inputString));
            String s = "1.0";
//            System.out.println(linearSearchBackward(a, (int) inputString));
//            System.out.println(linearSearchBackward(a, Integer.parseInt(s)));
            System.out.println(linearSearchBackward(a, input));
        } while (input >= 0);

    }

    public static boolean isSorted(int [] a) {
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i+1]) {
                return false;
            }
//            else {
//                return true;
//            }
        }
        return true;
    }

    public static int linearSearch(String [] a, String value) {
        for(int i = 0; i < a.length; i++) {
            if(a[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(int [] data, int value) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("enter a number: ");
//        int number = s.nextInt();
        for(int i = 0; i < data.length; i++) {
            if(data[i] == value) {
                return i;
            }
//            else {
//                return -1;
//            }
        }
        return -1;
    }

    public static int linearSearchBackward(int [] a, int value) {
        for(int i = a.length - 1; i >= 0; i--) {
            if(a[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
