import java.util.Scanner;
class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units: ");
        int u = sc.nextInt();
        int bill;
        if (u <= 100) {
            bill = u * 1;
        } else if (u <= 200) {
            bill = 100 + (u - 100) * 2;
        } else {
            bill = 100 + 200 + (u - 200) * 3;
        }
        System.out.println("Bill amount = " + bill);
    }
}