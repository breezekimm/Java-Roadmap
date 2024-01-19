package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    void addItem(Item item) {
        if(itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("장바구니가 가득 찼습니다.");
        }
    }

    void displayItems() {
        System.out.println("장바구니 상품 출력");
        for(int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합 : " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();

        }
        return totalPrice;
    }
}
