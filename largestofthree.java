import java.util.Scanner;

public class largestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter three numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a > b && a > c)
            System.out.println(a + " is largest");
        else if(b > c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");
    }
}
