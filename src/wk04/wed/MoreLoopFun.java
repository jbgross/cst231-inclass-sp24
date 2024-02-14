package wk04.wed;

import com.sun.security.jgss.GSSUtil;

public class MoreLoopFun {
    public static void main(String[] args) {
        int x = 5;
        x++;
        System.out.println(x++);
        int y = x;
        System.out.println(y);
        y++;
        System.out.println(x);
        x += 2;
//        ++x++;
        System.out.println(x);
//        (x++)++;
//        7++;
        boolean a = true, b = false;
        if(a) {
            System.out.println("a is true");
        }
        if(a && b) {
            System.out.println("both true");
        } else if(a == b || b != a) {
            System.out.println("only one true");
        } else {
            System.out.println("both false");
        }

        int z = 10;
        System.out.println(x + " " + y);
        if(x < y && x++ > z) {
            System.out.println("x is greater than y and z");
        }

        if(!( x + y > z)) {
            System.out.println("false");
        } else if (! false) {
            System.out.println("true");
        }

//        if(x + y) {
//
//        }

        int count = 0, max = 10;
        while(count < max) {
            System.out.print(count + " ");
            System.out.println(max - count++);
            if(count % 2 == 0) {
                System.out.println("count is even");
            }
//            count++;
        }
        System.out.println();
        System.out.println("done");
    }
}
