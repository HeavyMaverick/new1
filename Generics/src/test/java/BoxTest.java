import org.junit.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<Integer> box = new Box<>(5, 10, 15);
        Box<Float> box2 = new Box<>(5f, 10f, 15f);
        assertEquals(0, box.compare(box2));
    }
}