package poly.basic;

public class CastingMain5 {

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
        if (parent instanceof Child) {
            System.out.println("Child instacne 맞음 " + parent);
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
