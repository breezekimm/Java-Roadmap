package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils() {
        // private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int val: values) {
            sum += val;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum(values)  / values.length;
    }

    public static int min(int[] values) {
        Arrays.sort(values);
        return values[0];
    }

    public static int max(int[] values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }
}
