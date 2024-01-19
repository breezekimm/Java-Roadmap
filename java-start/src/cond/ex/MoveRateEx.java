package cond.ex;

public class MoveRateEx {
    public static void main(String[] args) {
        double rating = 7.2;
        String movie9 = "어바웃타임";
        String movie8 = "토이스토리";
        String movie7 = "고질라";

        if(rating >= 9) {
            System.out.println("'"+ movie9 +"'" + "을 추천합니다.");
        } else if (rating >= 8) {
            System.out.println("'"+ movie9 +"'" + "을 추천합니다.");
            System.out.println("'"+ movie8 +"'" + "을 추천합니다.");
        } else if (rating >= 7) {
            System.out.println("'"+ movie9 +"'" + "을 추천합니다.");
            System.out.println("'"+ movie8 +"'" + "을 추천합니다.");
            System.out.println("'"+ movie7 +"'" + "을 추천합니다.");
        }
    }
}
