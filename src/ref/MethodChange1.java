package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("before method call : a = " + a);
        changePrimitive(a);
        System.out.println("after method call : a = " + a);
    }

    static void changePrimitive(int x) {
        x = 20;
    }

}
