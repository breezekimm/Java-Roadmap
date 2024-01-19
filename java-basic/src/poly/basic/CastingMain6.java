package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Call Parent1 " + parent1);
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Call Parent2 " + parent2);
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        // Java16 부터는 instanceof를 사용하면서 동시에 변수를 선언할 수 있다.
        if (parent instanceof Child child) {
            System.out.println("Child instacne 맞음 ");
            child.childMethod();
        }
    }
}
