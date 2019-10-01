package potter;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Item> books = new ArrayList<>();

    public void addItem(Item item) {
        books.add(item);
    }

    public List<Item> getItems() {
        return books;
    }
}
