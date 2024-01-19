package static2;

//import static static2.DecoData.staticCall;
//import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. static call");
        // import static 하면 클래스 명 생략하고 메서드 호출 가능.
        DecoData.staticCall();

        System.out.println("2. instance call 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. instance call 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
