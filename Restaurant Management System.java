import java.util.Scanner;

public class RestaurantManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizzaRestaurant = new Pizza();
        Beverage beverageRestaurant = new Beverage();

        System.out.println("Welcome to the Restaurant Management System!");
        System.out.println("What would you like to order?");
        System.out.println("1. Pizza");
        System.out.println("2. Beverage");
        System.out.println("3. Both Pizza and Beverage");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("===== Pizza Order =====");
                pizzaRestaurant.menu();
                System.out.print("Enter Product ID: ");
                String pizzaId = scanner.next();
                System.out.print("Enter Product Name: ");
                String pizzaName = scanner.next();
                pizzaRestaurant.orderManagement(pizzaId, pizzaName, "Home Delivery", 25.99, 30);
                pizzaRestaurant.homeDelivery("Swiggy");
                pizzaRestaurant.payment("Credit Card");
                pizzaRestaurant.offers("Buy 1 Get 1 Free");
                pizzaRestaurant.feedback("Amazing pizza!");
                break;

            case 2:
                System.out.println("===== Beverage Order =====");
                beverageRestaurant.menu();
                System.out.print("Enter Product ID: ");
                String beverageId = scanner.next();
                System.out.print("Enter Product Name: ");
                String beverageName = scanner.next();
                beverageRestaurant.orderManagement(beverageId, beverageName, "Table Reservation", 10.99, 20);
                beverageRestaurant.homeDelivery("Zomato");
                beverageRestaurant.payment("Cash on Delivery");
                beverageRestaurant.offers("Happy Hour - 50% Off");
                beverageRestaurant.feedback("Refreshing drinks!");
                break;

            case 3:
                System.out.println("===== Pizza and Beverage Order =====");
                pizzaRestaurant.menu();
                System.out.print("Enter Pizza Product ID: ");
                String pizzaIdBoth = scanner.next();
                System.out.print("Enter Pizza Product Name: ");
                String pizzaNameBoth = scanner.next();
                pizzaRestaurant.orderManagement(pizzaIdBoth, pizzaNameBoth, "Home Delivery", 25.99, 30);

                beverageRestaurant.menu();
                System.out.print("Enter Beverage Product ID: ");
                String beverageIdBoth = scanner.next();
                System.out.print("Enter Beverage Product Name: ");
                String beverageNameBoth = scanner.next();
                beverageRestaurant.orderManagement(beverageIdBoth, beverageNameBoth, "Table Reservation", 10.99, 20);

                pizzaRestaurant.homeDelivery("Swiggy");
                beverageRestaurant.homeDelivery("Zomato");
                pizzaRestaurant.payment("Credit Card");
                beverageRestaurant.payment("Cash on Delivery");
                pizzaRestaurant.offers("Buy 1 Get 1 Free");
                beverageRestaurant.offers("Happy Hour - 50% Off");
                pizzaRestaurant.feedback("Amazing pizza!");
                beverageRestaurant.feedback("Refreshing drinks!");
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
                break;
        }

        scanner.close();
    }
}