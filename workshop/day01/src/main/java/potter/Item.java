package potter;

public class Item {

    private Book book;
    private int quantity;

    public Item(Book book, int quantity) {
        this.book = book;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
