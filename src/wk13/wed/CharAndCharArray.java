package wk13.wed;

public class CharAndCharArray {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);
        a++;
        System.out.println(a);
        int b = a;
        System.out.println(b);
        if(a == b) {
            System.out.println("same");
        }
        System.out.println((char)(a + 5));

        char c = 'X';
        char d = 'x';
        if(c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }

        char [] row = {0, 0, 0};
        System.out.println(row[0]);

        char e = 48 + 5;
        System.out.println(e);
        System.out.println(e + e);
        System.out.println((char)(e + e));
        int f = 'j';

    }
}
