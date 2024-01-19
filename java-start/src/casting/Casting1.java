package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> Long
        System.out.println("longValue = " + longValue); // 10

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue); // 10.0

        doubleValue = 20L; // Long -> double
        System.out.println("doubleValue2 = " + doubleValue); // 20.0
    }
}
