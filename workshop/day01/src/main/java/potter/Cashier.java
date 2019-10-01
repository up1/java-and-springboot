package potter;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.stream.DoubleStream.*;

public class Cashier {

    public double getTotalPrice(Basket basket) {
        // TODO :: calculate total price
        double totalPrice = 0;
        for (Item item: basket.getItems()) {
            totalPrice += item.getQuantity() * item.getBook().getPrice();
        }
        Stream<Item> itemStream = basket.getItems().stream();
        totalPrice =
                basket.getItems()
                .stream().
                flatMapToDouble( item -> of(item.getQuantity() * item.getBook().getPrice()))
                .sum();
        return totalPrice;
    }

}
