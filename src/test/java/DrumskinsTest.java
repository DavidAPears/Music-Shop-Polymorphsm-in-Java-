import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumskinsTest {

    Drumskins drumskins;

    @Before
    public void before() {
        drumskins = new Drumskins("Drumskins", 1.99, 9.99);
    }

    @Test
    public void getType() {
        assertEquals("Drumskins", drumskins.getType());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(1.99, drumskins.getBuyingPrice(), 0.01);
    }


    @Test
    public void getSellingPrice() {
        assertEquals(9.99, drumskins.getSellingPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(8.00, drumskins.calculateMarkup(), 0.01);
    }
}
