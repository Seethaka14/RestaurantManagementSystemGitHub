import java.util.Scanner;

// Base class representing common functionalities of a restaurant
class Restaurant {
    // Common methods for all restaurants
    void menu() {
        System.out.println("===== Restaurant Menu =====");
    }

    void orderManagement(String productId, String productName, String deliveryType, double totalAmount, int TTT) {
        System.out.println("Order Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Delivery Type: " + deliveryType);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Table Turnaround Time (TTT): " + TTT + " minutes");
    }

    void homeDelivery(String service) {
        System.out.println("Home Delivery Service: " + service);
    }

    void payment(String method) {
        System.out.println("Payment Method: " + method);
    }

    void offers(String offerDetails) {
        System.out.println("Offer: " + offerDetails);
    }

    void feedback(String customerFeedback) {
        System.out.println("Customer Feedback: " + customerFeedback);
    }
}

// Pizza class extending the Restaurant class
class Pizza extends Restaurant {
    @Override
    void menu() {
        super.menu(); // Call base class menu
        System.out.println("1. Margherita - $10");
        System.out.println("2. Pepperoni - $12");
        System.out.println("3. Veggie Supreme - $15");
        System.out.println("======================");
    }

    @Override
    void orderManagement(String productId, String productName, String deliveryType, double totalAmount, int TTT) {
        System.out.println("===== Pizza Order =====");
        super.orderManagement(productId, productName, deliveryType, totalAmount, TTT); // Call base class method
    }
}

// Beverage class extending the Restaurant class
class Beverage extends Restaurant {
    @Override
    void menu() {
        super.menu(); // Call base class menu
        System.out.println("1. Cola - $2");
        System.out.println("2. Lemonade - $3");
        System.out.println("3. Iced Tea - $4");
        System.out.println("======================");
    }

    @Override
    void orderManagement(String productId, String productName, String deliveryType, double totalAmount, int TTT) {
        System.out.println("===== Beverage Order =====");
        super.orderManagement(productId, productName, deliveryType, totalAmount, TTT); // Call base class method
    }
}

// Main class to run the Restaurant Management System
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