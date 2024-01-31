package wk01.wed;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x: " + x);
        x = 10;
        System.out.println("x: " + x);
        x = x + 4;
        int y = x -7;
        System.out.println("y: " + y);
        System.out.println("x: " + x);

        int z = x * y;
        System.out.println("z: " + z);
        System.out.println("y: " + y);
        System.out.println("x: " + x);

        int foo = x - y + z;
        int bar = (x * y) + (z / y);

        int baz = -5 / 2;
        int grault = -5 % 2;
        System.out.println("baz = " + baz);
        System.out.println("grault = " + grault);
        System.out.println(x + y);

        double u = 3.0;
        double w = Math.floor(u);
        System.out.println(w);
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false == true;
        System.out.println(b3);
        boolean whole = w == u;
        System.out.println("Is " + u + " a whole number? " + whole);

//        System.out.println("Hello Earth!");
    }
}