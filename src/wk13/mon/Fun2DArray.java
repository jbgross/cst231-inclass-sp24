package wk13.mon;

public class Fun2DArray {
    public static void main(String[] args) {
        int [] a = {3, 4, 5};
        a[0] = 5;
         print(a);
//        System.out.println(a);
        for(int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
        }
        System.out.println();

        int [][] b = new int[3][4];
//        System.out.println(b[0][0]);
        print(b);
        fill(b);
        print(b);
    }

    public static void fill(int [][] data) {
        int count = 0;
        for(int row = 0; row < data.length;row++) {
            for(int col = 0; col < data[row].length; col++) {
//                data[row][col] = count++;
                data[row][col] = row*data[row].length + col;
            }
        }
    }

    public static void print(int [] x) {
        System.out.println("printing 1d array");
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    private static void print(int[][] b) {
        System.out.println("printing 2d array");
        for(int i = 0; i < b.length; i++) {
            for(int k = 0; k < b[i].length; k++) {
                System.out.print(b[i][k] + " ");
            }
            System.out.println();
        }
    }
}
