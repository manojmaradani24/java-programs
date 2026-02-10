import java.util.*;
class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();
        if (s.isEmpty()) {
            System.out.println("Number of words: 0");
            return;
        }
        String[] words = s.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }
}