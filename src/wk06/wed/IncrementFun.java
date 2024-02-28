package wk06.wed;

public class IncrementFun {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x = " + x);
        System.out.println(++x);
        System.out.println("x = " + x);

        System.out.println(x++);
        System.out.println("x = " + x);
        x++;
        ++x; // equivalent to x = x + 1
        int y = x;
        System.out.println("starting loop with x = " + x);
        while(x-- > 0) {
            System.out.print(x + " ");
//            x--;
        }
        if (x > y) { x--; }

        System.out.println();
        System.out.println("starting loop with y = " + y);
        while(--y > 0) {
            System.out.print(y + " ");
        }

        System.out.println();
        System.out.println("final value of x = " + x);
        System.out.println("final value of y = " + y);

    }
}
