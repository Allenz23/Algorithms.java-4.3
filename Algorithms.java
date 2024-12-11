import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        System.out.println("Number of two letter words: " + twoLetter);
        int maxLength = maxLength();
        System.out.println("Max length of word: " + maxLength);
        int longest = longest();
        System.out.println("# of longest words: " + longest);
        int palindrome = palindrome();
        System.out.println("# of palindromes: " + palindrome);
        s.close();
    }
    public static int twoLetter() throws FileNotFoundException{
        int count = 0;
        String word;
        s = new Scanner(f);
        while(s.hasNextLine()){
            word = s.nextLine();
            if (word.length()==2) count++;
        }
        return count;
    }
    public static int maxLength() throws FileNotFoundException{
        int longest = 0;
        String word;
        s = new Scanner (f);
        while(s.hasNextLine()){
            word = s.nextLine();
            if (word.length()>longest) longest = word.length();
        }
        return longest;
    }
    public static int longest() throws FileNotFoundException{
        int longest = maxLength();
        int count = 0;
        String word;
        s = new Scanner (f);
        while(s.hasNextLine()){
            word = s.nextLine();
            if (word.length()==longest) count++;
        }
        return count;
    }
    public static int palindrome() throws FileNotFoundException{
        s = new Scanner (f);
        int count = 0;
        while(s.hasNextLine()){
            String word = "";
            word = s.nextLine();
            StringBuilder str = new StringBuilder(word);
            str.reverse();
            if (word.equals(str.toString())) count++;
        }
        return count;
        
    }
}
