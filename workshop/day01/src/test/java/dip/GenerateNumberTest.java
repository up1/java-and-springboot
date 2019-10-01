package dip;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class GenerateNumberTest {

    @Test
    public void get_5() {
        Random random = new Random5();
        GenerateNumber g = new GenerateNumber();
        g.setRandom(random);
        assertEquals(5, g.get());
    }
}

class Random5 extends Random {
    @Override
    public int nextInt(int bound) {
        return 5;
    }
}