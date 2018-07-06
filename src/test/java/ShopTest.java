import Accessories.Drumskins;
import Accessories.Drumsticks;
import Accessories.ISell;
import Instruments.Guitar;
import Instruments.Piano;
import Instruments.Saxophone;
import org.junit.Before;

import java.util.ArrayList;

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
        stock = new ArrayList<>();
        stock.add(guitar);
        stock.add(piano);
        stock.add(saxophone);

        shop = new Shop(stock);
    }


}

