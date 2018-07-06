package Instruments;

public class Piano extends Instrument{

    private int numberOfKeys;
    private String manufacturer;

    public Piano(double buyingPrice, double sellingPrice, String instrumentMaterial, String instrumentColour, String instrumentType, int numberOfKeys, String manufacturer) {
        super(buyingPrice, sellingPrice, instrumentMaterial, instrumentColour, instrumentType);
        this.numberOfKeys = 88;
        this.manufacturer = manufacturer;
    }


    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}
