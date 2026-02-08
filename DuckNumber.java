import java.util.*;
class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String n = sc.next();   
        boolean hasZero = false;
        for (int i = 1; i < n.length(); i++) {  
            if (n.charAt(i) == '0') {
                hasZero = true;
                break;
            }
        }
        if (hasZero) {
            System.out.println(n + " is a Duck Number");
        } else {
            System.out.println(n + " is not a Duck Number");
        }
    }
}