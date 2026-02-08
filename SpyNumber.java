import java.util.*;
class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int product = 1;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }
        if (sum == product) {
            System.out.println(n + " is a Spy Number");
        } else {
            System.out.println(n + " is not a Spy Number");
        }
    }
}