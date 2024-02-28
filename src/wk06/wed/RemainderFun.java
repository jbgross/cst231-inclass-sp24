package wk06.wed;

public class RemainderFun {
    public static void main(String[] args) {
        int x = 0;
        int y = 3;
        System.out.print(x%y + " ");
        x = x + 1; // x += 1;
        System.out.print(x%y + " ");
        x = x + 1;
        System.out.print(x%y + " ");
        x = x + 1;
        System.out.println(x%y);
    }
}
