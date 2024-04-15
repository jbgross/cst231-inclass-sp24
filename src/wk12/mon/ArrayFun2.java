package wk12.mon;

public class ArrayFun2 {
    public static void main(String[] args) {
        int [] a = {5, 6, 7};
        String [] s = {"hello", "goodbye", "ciao"};
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        int [] b = a;
        a[1] = 12;
//        a = new int[0];
        for(int i = 0; i < b.length; i++) {
//            if(isPrime(i)) {
                System.out.print(b[i] + " ");
//            }
        }
        System.out.println();

        for(int i = 0; i < b.length; i += 2) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        b = copy(a);
        b[1] = 400;
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }


    public static boolean isPrime(int number) {
        for(int i = 2; i < number; i++) {
            if(number%i == 0) {
                return false;
//            } else {
//                return true;
            }
        }
        return true;
    }

    public static int [] copy(int [] a) {
//        return a;
//        int [] b = a;
//        return b;
        int [] b = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }
}
