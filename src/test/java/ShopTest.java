import Accessories.Drumskins;
import Accessories.Drumsticks;
import Accessories.ISell;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Shop shop;
    Drumsticks drumsticks;
    Drumskins drumskins;
    Guitar guitar;
    Saxophone saxophone;
    Piano piano;
    ArrayList<ISell> stock;


    @Before
    public void before() {
        drumsticks = new Drumsticks("Accessories.Drumsticks", 1.99, 4.99);
        drumskins = new Drumskins("Accessories.Drumskins", 1.99, 9.99);
        guitar = new Guitar(99.00, 499.00, "Mahogany", "Cherry Sunburst", "Guitar", 6, "Gibson");
        piano = new Piano(250.00, 999.00, "Ebony", "Black", "Piano", 88, "Yamaha");
        saxophone = new Saxophone( 59.00, 179.99, "Brass", "Gold", "Saxophone", 23, "Hanson");
        stock = new ArrayList<>();
        stock.add(guitar);
        stock.add(piano);
        stock.add(saxophone);

        shop = new Shop(stock);
    }

    @Test
    public void canAddStockSize(){
        shop.addToStock(drumskins);
        assertEquals(4, shop.getStockSize());
    }

    @Test
    public void canRemoveStockSize(){
        shop.removeFromStock(piano);
        assertEquals(2, shop.getStockSize());
    }


    @Test
    public void canCalculateTotalMarkup(){
        shop.addToStock(drumsticks);
        shop.addToStock(drumskins);
        assertEquals(1280.99, shop.calculateTotalMarkup(), 0.01);
    }



}

