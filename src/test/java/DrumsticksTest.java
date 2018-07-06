import Accessories.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before() {
        drumsticks = new Drumsticks("Accessories.Drumsticks", 1.99, 4.99);
    }

    @Test
    public void getType() {
        assertEquals("Accessories.Drumsticks", drumsticks.getType());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(1.99, drumsticks.getBuyingPrice(), 0.01);
    }


    @Test
    public void getSellingPrice() {
        assertEquals(4.99, drumsticks.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(3.00, drumsticks.calculateMarkup(), 0.01);
    }

}
