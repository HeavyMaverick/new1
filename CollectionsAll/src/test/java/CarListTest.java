import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {
    private CarList carList;

    @org.junit.Before
    public void setUp() throws Exception {
    }
    @Test
    public void whenAdded100ThenSize100(){
        for (int i = 0; i < 100; i++){
            carList.add(new Car("Brand" + i, i));
        }
        assertEquals(100, carList.size());
    }
    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased(){
        for(int i = 0; i< 100; i++){
            carList.add(new Car("Brand" + i, i));
        }
        assertEquals(100, carList.size());
        assertTrue(carList.removeAt(5));
        assertEquals(99, carList.size());
    }
}