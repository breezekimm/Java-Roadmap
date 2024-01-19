package extends1.ex;

public class Book extends Item {
    private String author;
    private String isbs;

    public Book(String name, int price, String author, String isbs) {
        super(name, price);
        this.author = author;
        this.isbs = isbs;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자 : " + author + ", isbn : " + isbs);
    }
}
