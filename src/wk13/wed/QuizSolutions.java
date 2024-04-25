package wk13.wed;

public class QuizSolutions {
    public static int sumEvens(int [][] data) {
        int sum = 0;
        for(int row = 0; row < data.length; row++) {
            for(int col = 0; col < data[row].length; col++) {
                if(data[row][col]%2 == 0) {
                    sum += data[row][col];
                    // sum = sum + data[row][col];
                }
            }
        }

        return sum;
    }

    public static void sumEvensAndOdds(int [][] data) {
        int total = sum(data);
        int evens = sumEvens(data);
        int odds = total - evens;
        System.out.println("The sum of evens is " + evens);
        System.out.println("The sum of odds is " + odds);
        System.out.println("The total sum is " + total);
    }

    public static int sum(int [][] data) {
        return 0;
    }
}
