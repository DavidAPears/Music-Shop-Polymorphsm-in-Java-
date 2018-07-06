public class Drumsticks implements ISell {

    private String type;
    private double buyingPrice;
    private double sellingPrice;

    public Drumsticks(String type, double buyingPrice, double sellingPrice) {
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellingPrice - buyingPrice;
    }

}
