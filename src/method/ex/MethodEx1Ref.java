package method.ex;

public class MethodEx1Ref {
    public static String add(int a, int b, int c) {
        int sum = a + b + c;

        return  "평균값 : " + (sum / 3.0);
    }

    public static void main(String[] args) {
        MethodEx1Ref method = new MethodEx1Ref();
        System.out.println(method.add(1, 2, 4));
    }
}
