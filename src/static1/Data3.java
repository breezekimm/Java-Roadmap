package static1;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++;
        /*
         static변수는 Data3.count++; 로 접근가능. == 자신의 클래스에 있는 정적 변수라면 클래스명을 생략 할 수 있다.
         위의 name은 Data3.name(x).

         name은 클래스로부터 새롭게 생성될 인스턴스의 변수이고,
         count는 클래스가 특별히 관리하는 일종의 공용변수이기 때문에 하나만 존재
         반면에 인스턴스 변수는 인스턴스의 수 만큼 존재.

         name, count 둘 다 멤버 변수(필드). 다만 static 여부에 따라 분류 가능.
         인스턴스 변수 : static X, 인스턴스를 생성해야 사용할 수 있음. 인스턴스 만들 때마다 생성된다.
         클래스 변수 : static O, 클래스 변수, 정적변수, static 변수 등으로 부른다.
         인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다.
         자바 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.

         */
    }
}
