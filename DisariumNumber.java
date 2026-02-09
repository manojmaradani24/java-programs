import java.util.Scanner;
public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + power(digit, digits);
            digits--;
            temp = temp / 10;
        }
        if (sum == original) {
            System.out.println(original + " is a Disarium Number");
        } else {
            System.out.println(original + " is NOT a Disarium Number");
        }
    }
    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }
        return result;
    }
}