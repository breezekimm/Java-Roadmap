package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            int num = 2 * i;
            i++;
            System.out.println(num);
        }
    }
}

/*
package loop.ex;
public class WhileEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count++;
        } }
}
*/