import java.util.*;
class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        boolean isPangram = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("It is a Pangram");
        } else {
            System.out.println("It is NOT a Pangram");
        }
    }
}