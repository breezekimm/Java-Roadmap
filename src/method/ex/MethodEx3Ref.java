package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        MethodEx3Ref method = new MethodEx3Ref();
        int balance = 10000;
        balance = deposit(balance, 10000);
        balance = deposit(balance, 20000);

        balance = withdraw(balance, 30000);
        balance = withdraw(balance, 20000);

        System.out.println("최종 잔액 : " + balance + "원");
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance < withdrawAmount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원 출금하였습니다. 현재 잔액 : " + balance + "원");
        }
        return balance;
    }


}
