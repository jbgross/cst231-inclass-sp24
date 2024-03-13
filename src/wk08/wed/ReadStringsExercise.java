package wk08.wed;
import java.io.*;
import java.util.*;

public class ReadStringsExercise {
    public static void main(String[] args) throws IOException {
        // "C:\Users\otter\IdeaProjects\cst231-inclass-sp24\src\wk08\wed\strings.txt"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = in.next();
        FileReader fr = new FileReader("src/wk08/wed/" + filename);
        int wordCount = 0;
//        for(Scanner fs = new Scanner(fr); fs.hasNext(); wordCount++) {
//            System.out.println(fs.next());
//        }
        Scanner fs = new Scanner(fr);
        while(fs.hasNext()) {
            System.out.println(fs.next());
            wordCount++;
        }
        fr.close();
        System.out.println("Number of words: " + wordCount);
    }
}
