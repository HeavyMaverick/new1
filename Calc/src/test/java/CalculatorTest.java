import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int expected = 20;
        int result = calculator.add(11, 9);
        assertEquals(expected, result);
    }

    @Test
    void divide() {
        double expected = 5;
        double result = calculator.divide(10, 2);
        assertEquals(expected, result, 0.001);
    }

    @Test()
    public void exceptionHasThrown(){
        Throwable exception = assertThrows(Exception.class, () -> calculator.add("asd","5"));
        assertEquals("Unexpected error occurred", exception.getMessage());
    }
//    @Test(expected = Exception.class)
//    public void whenInputIncorrectValueThenThrowException() {
//        calculator.add("asdfgasdf", "5");
//    }
    // не работает для junit5

    @AfterEach
    public void close() {
        calculator = null;
    }
}