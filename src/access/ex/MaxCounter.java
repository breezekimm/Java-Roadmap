package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        /*
        if(maxValid(count) == false) {
            System.out.println("최대값을 초과할 수 없습니다.");
        }  else {
            count++;
        }
        */

        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }

    private boolean maxValid(int count) {
        if(count >= max) {
            return false;
        } else {
            return true;
        }
    }
}
