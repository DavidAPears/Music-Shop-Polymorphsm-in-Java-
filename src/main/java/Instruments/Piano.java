package Instruments;

public class Piano extends Instrument{

    private int numberOfKeys;
    private String manufacturer;

    public Piano(String instrumentMaterial, String instrumentColour, String instrumentType, int numberOfKeys, String manufacturer) {
        super(instrumentMaterial, instrumentColour, instrumentType);
        this.numberOfKeys = 88;
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
