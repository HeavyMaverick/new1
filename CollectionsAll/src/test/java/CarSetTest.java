import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarSetTest {
    private CarHashSet carSet;

    @Before
    public void setUp() throws Exception {
        carSet = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("Brand" + i, i));
        }
    }

    @Test
    public void testAdd1Element() {
        Assert.assertEquals(100, carSet.size());
        Assert.assertTrue(carSet.add(new Car("BMW", 10)));
        Assert.assertFalse(carSet.add(new Car("BMW", 10)));
        Assert.assertFalse(carSet.add(new Car("BMW", 10)));
        Assert.assertEquals(101, carSet.size());
    }

    @Test
    public void testRemove1Element() {
        Assert.assertTrue(carSet.remove(new Car("Brand40", 40)));
        Assert.assertEquals(99, carSet.size());
        Assert.assertFalse(carSet.remove(new Car("Brand40", 40)));
        Assert.assertEquals(99, carSet.size());
    }

    @Test
    public void testClearAllElements() {
        carSet.clear();
        Assert.assertEquals(0, carSet.size());
    }


}