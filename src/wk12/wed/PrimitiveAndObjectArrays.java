package wk12.wed;
import java.util.*;

public class PrimitiveAndObjectArrays {
    public static void main(String[] args) {
//        String s = null;
//        System.out.println(s);
//        if("".equals(s)) {
//            System.out.println("same");
//        } else {
//            System.out.println("different");
//        }
//        int [] a = null;
//        System.out.println(a == null);

        int size = 5;
        int [] b = new int[size];

        print(b);
        print(b);

        int x = 3;
        print(x);
        print(x);

//        String [] names = new String[3];

        String [] names = {"Hector", "Anya", ""};
        System.out.println(names[2].length());

        String [] more = new String[3];
        more[3] = "foo";
        System.out.println(more[3].length());
    }

    public static void print(int [] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            a[i] = 5;
        }
        System.out.println();
    }

    public static void print(int a) {
        System.out.println(a);
        a = 5;
    }
}
