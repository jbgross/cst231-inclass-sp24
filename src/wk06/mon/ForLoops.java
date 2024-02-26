package wk06.mon;

public class ForLoops {
    public static void main(String[] args) {
        int count = 0;
        boolean b = true;
        double u = 3.0 / 2 + 1;
        System.out.println("u = " + u);
        int max = 10;
        while (count < max) {
            // [] - square brackets
            // {} - curly braces
            // () - parentheses (parens)
            System.out.print((count + 1) + " ");
            ++count;
        }
        System.out.println("done");

        int x;
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println("done");

        x = 2;
        int i;
        for (i = 0; ++i < 10; ) {
            System.out.print(" " + i);
        }
        System.out.println(i);
        System.out.println("done");

        for(int k = 10; k > 0; k--) {
            System.out.print(k + " ");
        }
    }
}
