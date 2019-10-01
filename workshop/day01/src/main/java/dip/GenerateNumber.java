package dip;

import java.util.Random;

public class GenerateNumber {
    Random random;
    public int get() {
        return random.nextInt(10);
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
