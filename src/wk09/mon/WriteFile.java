package wk09.mon;
import java.io.*;
import java.util.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String filename = "src/wk09/mon/out.txt";
        FileWriter fw = new FileWriter(filename, true);
        PrintWriter pw = new PrintWriter(fw);
//        PrintWriter pw = new PrintWriter(System.out);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int rep = in.nextInt();
        System.out.print("Enter a word: ");
        String word = in.next();

        for(int i = 0; i < rep; i++) {
            pw.println(word);
        }

        pw.flush();


        pw.println("goodbye");
        fw.close();
    }
}
