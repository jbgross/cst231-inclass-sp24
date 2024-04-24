package wk13.wed;

public class Numbers2D {

    public static void main(String[] args) {
        int [][] a = {{1, 2, 3}, {3, 2, 1}};
        int sum = sum(a);
        System.out.println(sum);
        int primeCount = countPrimes(a);
        System.out.println(primeCount);
    }

    public static int countPrimes(int [][] data) {
        int count = 0;
        for(int row = 0; row < data.length; row++) {
            for(int col = 0; col < data[row].length; col++) {
                if(isPrime(data[row][col])) {
                    count++;
                }
//                isPrime(data[row][col]) && count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int base) {
        return false;
    }

    public static int sum(int [][] data) {
        int sum = 0;
//        System.out.println("rows: " + data.length);
//        System.out.println("cols: " + data[0].length);
        for(int row = 0; row < data.length; row++) {
            for(int col = 0; col < data[row].length; col++) {
                sum += data[row][col];
            }
        }
        return sum;
    }
}
