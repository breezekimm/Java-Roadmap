package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0 ; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("for each");

        for (int number : numbers
             ) {
            System.out.println(number);
        }

        for (int i = 0 ; i < numbers.length; i++) {
            System.out.println("number" + i + "의 결과는 : "+ numbers[i]);
//            System.out.println("number" + (i + 1) + "의 결과는 : "+ numbers[i]);
        }
    }
}
