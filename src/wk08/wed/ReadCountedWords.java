package wk08.wed;
import java.util.*;
import java.io.*;

public class ReadCountedWords {
    public static void main(String[] args) throws IOException {
        String filename = "src/wk08/wed/s3.txt";
        FileReader fr = new FileReader(filename);

        Scanner fs = new Scanner(fr);
        int wordCount = fs.nextInt();
        System.out.println(wordCount);
        for(int i = 0; i < wordCount && fs.hasNext(); i++) {
            System.out.println(fs.next());
        }
        fr.close();

    }
}
