package final1.ex;

public class MemberMain {

    public static void main(String[] args) {
        Member memeber = new Member("myId", "kim");
        memeber.print();
        memeber.changeData("myId2", "seo");
        memeber.print();
    }
}
