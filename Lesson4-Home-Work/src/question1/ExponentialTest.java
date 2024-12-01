package question1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExponentialTest {
    Exponential exponential = new Exponential();
    @Test
    public void testPowerWhenExponentIsZero() {
        assertEquals(1, exponential.power(2, 0));
    }

    @Test
    public void testPowerWhenExponentIsOne() {
        assertEquals(7, exponential.power(7, 1));
    }

    @Test
    public void testWhenExponentialIsGreaterThanOne() {
        assertEquals(1024, exponential.power(2, 10));
    }
}