package Instruments;

import Accessories.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String instrumentMaterial;
    private String instrumentColour;
    private String instrumentType;
    private double buyingPrice;
    private double sellingPrice;

    public Instrument(double buyingPrice, double sellingPrice, String instrumentMaterial, String instrumentColour, String instrumentType) {
        this.instrumentMaterial = instrumentMaterial;
        this.instrumentColour = instrumentColour;
        this.instrumentType = instrumentType;
        this.buyingPrice = buyingPrice;
;       this.sellingPrice = sellingPrice;
    }

    public String getInstrumentMaterial() {
        return this.instrumentMaterial;
    }

    public String getInstrumentColour() {
        return this.instrumentColour;
    }

    public String getInstrumentType() {
        return this.instrumentType;
    }


    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

    @Override
    public String play(String play){
        return play;
    }


    @Override
    public double getBuyingPrice() {
        return 0;
    }

    @Override
    public double getSellingPrice() {
        return 0;
    }
}

