import java.util.Scanner;
public class Functions {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping inside function:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Before swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        swap(x, y);
        System.out.println("After swapping in main method:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        sc.close();
    }
}
