public abstract class Beverage implements IBeverage {

    private String beverageType;
    private String city;
    private int totalSales;

    // Constructor
    public Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    // Get beverage type
    @Override
    public String getBeverageType() {
        return beverageType;
    }

    // Get city
    @Override
    public String getCity() {
        return city;
    }

    // Get total sales
    @Override
    public int getTotalSales() {
        return totalSales;
    }
}