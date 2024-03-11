package wk08.mon;

import java.io.*;
import java.util.*;

public class SimpleFileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr =
                new FileReader("src/file1.txt");
        Scanner fs = new Scanner(fr);
        String word = fs.next();
        System.out.println(word);
        fr.close();

        fr = new FileReader("src/numbers.txt");
        fs = new Scanner(fr);
        Scanner in = new Scanner(System.in);
//        int data = fs.nextInt();
        while (fs.hasNext()) {
            if (fs.hasNextInt()) {
                int data = fs.nextInt();
                System.out.println(data);
            } else {
                fs.next();
            }
        }
        System.out.println("done");
        fr.close();

    }
}
