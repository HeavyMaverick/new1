import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarListTest {
    private CarList carList;

    @Before
    public void setUp() throws Exception {
        carList = new CarArrayList();
        //carList = new CarLinkedList(); успешно проходят тесты
        for(int i = 0; i< 100; i++){
            carList.add(new Car("Brand" + i, i));
        }
    }
    @Test
    public void whenAdded100ThenSize100(){
        assertEquals(100, carList.size());
    }
    @Test
    public void whenElementRemovedByIndexThenSizeMustBeDecreased(){
        assertTrue(carList.removeAt(5));
        assertEquals(99, carList.size());
    }

    @Test
    public void whenElementRemovedThenSizeMustBeDecreased(){
        Car car = new Car("Toyota", 15);
        carList.add(car);
        assertEquals(101, carList.size());
        assertTrue(carList.removeAt(5));
        assertEquals(100, carList.size());
    }
    @Test
    public void returnFalse(){
        Car car = new Car("Brand", 15);
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }
    @Test
    public void whenClearSize0(){
        carList.clear();
        assertEquals(0,carList.size());
    }
    @Test(expected = Exception.class)
    public void thrownExceptionOutOfBounds(){
        carList.get(100);
    }
    @Test
    public void getReturnedRightValue(){
        Car car = carList.get(0);
        assertEquals("Brand0", car.getBrand());
    }
    @Test
    public void insertObjectInList(){
        Car car = new Car("Toyota", 1);
        carList.add(car, 50);
        Car carFromList = carList.get(50);
        assertEquals("Toyota", carFromList.getBrand());
    }
}