package potter;

import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;


// Data class
// POJO (Plain Old Java Object)
@Data
public class Book {

    private int id;
    private String name;
    private double price;
    private int stock;

    public Book() {
    }

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
