public class PassArray {
    static void printArray(int arr[]) {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        printArray(numbers);
    }
}