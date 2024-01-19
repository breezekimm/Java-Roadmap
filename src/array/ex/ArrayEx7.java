package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] students = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

//        int[] sums = new int[students.length];
//        double[] avgs = new double[students.length];

/*        for (int i = 0; i < students.length; i++) {
            int j = i;
            if(j >= 3) {
                j -= 1;
            }
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");
            System.out.print("국어 점수 : ");
            int kor = students[i][j] = sc.nextInt();

            System.out.print("영어 점수 : ");
            int eng = students[i][j] = sc.nextInt();

            System.out.print("수학 점수 : ");
            int math = students[i][j] = sc.nextInt();

            sums[i] += (kor + eng + math);
            avgs[i] += (double) sums[i]/students[0].length;
        }*/

        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < students[0].length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                students[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < students.length; i++) {
            int sum = 0;
            for (int j = 0; j < students[0].length; j++) {
                sum += students[i][j];
            }
            double avg = (double) sum / 3;
            System.out.println((i + 1) + "번 학생의 총점 : " + sum + ", 평균 : " + avg);
        }

    }
}
