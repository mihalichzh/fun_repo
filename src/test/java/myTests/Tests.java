package myTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    void testPositive() {
        Assertions.assertEquals(5, 5);
    }

    @Test
    void testNegative() {
        Assertions.assertEquals(5, 5);
    }

    @Test
    void testAssumptionError() {
        Assumptions.assumeFalse(2 > 1);
    }
}
