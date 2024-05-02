import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int expected = 20;
        int result = calculator.add(11, 9);
        assertEquals(expected, result);
        int expected2 = 40;
        int result2 = calculator.add(39, 1);
        assertEquals(expected2, result2);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        double expected = 5;
        double result = calculator.divide(10, 2);
        assertEquals(expected, result, 0.001);
    }
}