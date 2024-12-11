import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        System.out.println("# of twoLetter" = twoLetter);
        s.close();

public static int twoLetter() throws FileNotFoundException {
        s = new Scanner(f);
        int count = 0;
        int word = s.nextLine();
        while (s.hasNext()) {
            if (word.length()==2){
                count++;
                s.nextLine();
            }
        }
        return count;
}