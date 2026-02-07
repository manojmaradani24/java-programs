class CallByValue {
    static void change(int x) {
        x = 50;
    }
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before function call: " + a);
        change(a);
        System.out.println("After function call: " + a);
    }
}