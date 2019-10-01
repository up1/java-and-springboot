package potter;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void addItem_2_item() {
        Basket basket = new Basket();
        Item item1 = new Item(new Book(1, "A", 8), 1);
        Item item2 = new Item(new Book(1, "A", 8), 1);
        basket.addItem(item1);
        basket.addItem(item2);
        List<Item> items = basket.getItems();
        assertEquals(1, items.size());
        assertEquals(2, items.get(0).getQuantity());
    }

    @Test
    public void addItem_1_item() {
        Basket basket = new Basket();
        Item item1 = new Item(new Book(), 1);
        basket.addItem(item1);
        List<Item> items = basket.getItems();
        assertEquals(1, items.size());
    }
}