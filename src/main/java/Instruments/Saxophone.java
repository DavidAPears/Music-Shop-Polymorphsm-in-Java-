package Instruments;

public class Saxophone extends Instrument {

    private int numberOfKeys;
    private String manufacturer;


    public Saxophone(String instrumentMaterial, String instrumentColour, String instrumentType, int numberOfKeys, String manufacturer) {
        super(instrumentMaterial, instrumentColour, instrumentType);
        this.numberOfKeys = 23;
        this.manufacturer = manufacturer;
    }

    public String play(String play){
        return play;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}