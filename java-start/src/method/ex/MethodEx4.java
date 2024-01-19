package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        bank(0);
    }

    public static void bank(int balance) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("----------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("----------------------");
            System.out.print("선택 : ");
            int menu = sc.nextInt();

            int deposit, withdraw;

             if(menu == 1) {
                 System.out.print("입금액을 입력하세요 : ");
                 deposit = sc.nextInt();
                 System.out.println("before bal : " + balance);
                 System.out.println(deposit);
                 balance += deposit;
                 System.out.println(deposit + "원을 입금하셨습니다. 현재 잔액 : " + balance);
             }else if(menu == 2) {
                 System.out.print("출금액을 입력하세요 : ");
                 withdraw = sc.nextInt();
                 if(balance < withdraw) {
                     System.out.println( withdraw + "원을 출금하려 했으나 잔액이 부족합니다.");
                 } else {
                     balance -= withdraw;
                     System.out.println(withdraw + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
                 }
             }else if(menu == 3) {
                 System.out.println("현재 잔액 : " + balance + "원");

             }else if(menu == 4) {
                 System.out.println("시스템을 종료합니다.");
                 break;
             }
         }
    }

}
