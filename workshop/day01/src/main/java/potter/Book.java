package potter;

import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
import java.math.BigInteger;


// Data class
// POJO (Plain Old Java Object)
@Data
public class Book {

    private int id;
    private String name;

    private double price;

    public Book() {
    }

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }
}
