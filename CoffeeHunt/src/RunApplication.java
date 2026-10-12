import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String beverageType;
        String city;
        int totalSales;
        int choice;

        // Display beverage menu
        System.out.println("Select the beverage type");
        System.out.println("1) COFFEE");
        System.out.println("2) TEA");
        System.out.println("3) BOBA");

        // Get beverage selection
        System.out.print("\nEnter your choice: ");

        if (!input.hasNextInt()) {
            System.out.println("Invalid choice. Please enter 1, 2 or 3.");
            input.close();
            return;
        }

        choice = input.nextInt();
        input.nextLine();

        // Determine beverage type
        switch (choice) {
            case 1:
                beverageType = "COFFEE";
                break;

            case 2:
                beverageType = "TEA";
                break;

            case 3:
                beverageType = "BOBA";
                break;

            default:
                System.out.println("Invalid choice. Please select 1, 2 or 3.");
                input.close();
                return;
        }

        // Get city
        System.out.print("Enter the city: ");
        city = input.nextLine().trim();

        if (city.isEmpty()) {
            System.out.println("City cannot be empty.");
            input.close();
            return;
        }

        // Get total sales
        System.out.print("Enter the total sales of "
                + beverageType + " beverages in "
                + city.toUpperCase() + ": ");

        if (!input.hasNextInt()) {
            System.out.println("Invalid sales amount. Enter a whole number.");
            input.close();
            return;
        }

        totalSales = input.nextInt();

        if (totalSales < 0) {
            System.out.println("Sales cannot be negative.");
            input.close();
            return;
        }

        // Create BeverageSales object
        BeverageSales report = new BeverageSales(
                beverageType,
                city.toUpperCase(),
                totalSales
        );

        // Print report
        report.printReport();

        input.close();
    }
}
