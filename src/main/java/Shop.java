import Accessories.ISell;
import com.sun.tools.javac.jvm.Items;


import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }


    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public int getStockSize() {
        return stock.size();
    }


    public double calculateTotalMarkup(){
        double totalMarkup = 0;
        for (ISell item : this.stock) {
            totalMarkup += item.calculateMarkup();
        }
        return totalMarkup;
    }

}




