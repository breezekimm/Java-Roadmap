package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count;
        count = sc.nextInt();
        int[] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요 : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("가장 작은 정수 : " + numbers[0]);
        System.out.println("가장 큰 정수 : " + numbers[numbers.length - 1]);

    }
}
