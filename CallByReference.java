class Number {
    int value;
}
class CallByReference {
    static void change(Number n) {
        n.value = 50;   
    }
    public static void main(String[] args) {
        Number obj = new Number();
        obj.value = 10;
        System.out.println("Before function call: " + obj.value);
        change(obj);
        System.out.println("After function call: " + obj.value);
    }
}