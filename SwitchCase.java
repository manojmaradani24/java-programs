import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                System.out.println("Answer = " + (a + b));
                break;
            case '-':
                System.out.println("Answer = " + (a - b));
                break;
            case '*':
                System.out.println("Answer = " + (a * b));
                break;
            case '/':
                if (b != 0)
                    System.out.println("Answer = " + (a / b));
                else
                    System.out.println("Not possible");
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}
