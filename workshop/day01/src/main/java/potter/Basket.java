package potter;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Item> books = new ArrayList<>();

    public void addItem(Item item) {
        // Find existed book in basket
        for (Item i: books) {
            if(i.getBook().equals(item.getBook())) {
                // Update quantity
                i.updateQuantity(item.getQuantity());
                return;
            }
        }
        books.add(item);
    }

    public List<Item> getItems() {
        return books;
    }
}
