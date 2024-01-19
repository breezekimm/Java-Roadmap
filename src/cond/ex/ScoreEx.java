package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 85;
        String grade = "";

        if(score >= 90) {
            grade = "A";
            System.out.println("학점은 " + grade + "입니다.");
        } else if (score >= 80) {
            grade = "B";
            System.out.println("학점은 " + grade + "입니다.");
        } else if (score >= 70) {
            grade = "C";
            System.out.println("학점은 " + grade + "입니다.");
        } else if(score >= 65) {
            grade = "D";
            System.out.println("학점은 " + grade + "입니다.");
        } else {
            grade = "F";
            System.out.println("학점은 " + grade + "입니다.");
        }
        System.out.println(grade);
    }
}

