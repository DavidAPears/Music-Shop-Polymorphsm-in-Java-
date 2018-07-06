package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String manufacturer;


    public Guitar(String instrumentMaterial, String instrumentColour, String instrumentType, int numberOfStrings, String manufacturer) {
        super(instrumentMaterial, instrumentColour, instrumentType);
        this.numberOfStrings = numberOfStrings;
        this.manufacturer = manufacturer;
    }

    public String play(String play){
        return play;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}


