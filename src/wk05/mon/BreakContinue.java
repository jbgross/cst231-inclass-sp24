package wk05.mon;
import java.util.*;
public class BreakContinue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        while(! input.equals("stop")) {
            System.out.print("Enter word: ");
            input = in.next();
            if(input.equals("c")) {
                System.out.println("about to continue");
                continue;
            } else if(input.equals("b")) {
                System.out.println("about to break");
                break;
            } else if(input.equals("r")) {
                System.out.println("about to return");
                return;
            }
            System.out.println("last line of the loop body");
        }
        System.out.println("done with loop");
    }
}
