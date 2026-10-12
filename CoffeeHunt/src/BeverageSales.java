public class BeverageSales extends Beverage {

    // Constructor
    public BeverageSales(String beverageType, String city, int totalSales) {
        super(beverageType, city, totalSales);
    }

    // Print the report
    public void printReport() {

        System.out.println();
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println("****************************");

        System.out.println("BEVERAGE TYPE: " + getBeverageType());
        System.out.println("CITY: " + getCity());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}