package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        MethodEx2Ref method = new MethodEx2Ref();
        method.hello("Hello !", 3);
    }

    public static void hello (String msg, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }
}
