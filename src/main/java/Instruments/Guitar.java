package Instruments;


import Accessories.ISell;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String manufacturer;


    public Guitar(double buyingPrice, double sellingPrice,  String instrumentMaterial, String instrumentColour, String instrumentType, int numberOfStrings, String manufacturer) {
        super(buyingPrice, sellingPrice, instrumentMaterial, instrumentColour, instrumentType);
        this.numberOfStrings = numberOfStrings;
        this.manufacturer = manufacturer;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}


