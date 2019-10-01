package potter;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashierTest {

    @Test
    public void getTotalPrice() {
        // Create basket
        Basket basket = new Basket();
        Item item1 = new Item(new Book(1, "A", 8), 1);
        basket.addItem(item1);

        Cashier cashier = new Cashier();
        double totalPrice = cashier.getTotalPrice(basket);
        assertEquals(8, totalPrice, 0.0);
    }
}