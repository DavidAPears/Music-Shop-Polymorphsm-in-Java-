package Instruments;

public class Saxophone extends Instrument {

    private int numberOfKeys;
    private String manufacturer;


    public Saxophone(double buyingPrice, double sellingPrice, String instrumentMaterial, String instrumentColour, String instrumentType, int numberOfKeys, String manufacturer) {
        super(buyingPrice, sellingPrice, instrumentMaterial, instrumentColour, instrumentType);
        this.numberOfKeys = 23;
        this.manufacturer = manufacturer;
    }


    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}