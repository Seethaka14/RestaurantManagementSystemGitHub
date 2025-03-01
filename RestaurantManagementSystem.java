package vehicle;
import java.util.Scanner;
public class RestaurantManagementApp {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pizzases pizzaRestaurant = new Pizzases();
    Beverage beverageRestaurant = new Beverage();
    boolean continueOrdering = true;
    while(continueOrdering) {
    System.out.println("Welcome to the Restaurant Management System");
    System.out.println("What would you like to order?");
    System.out.println("1. Pizza");
    System.out.println("2. Beverage");
    System.out.println("3. Both Pizza and Beverage");
    System.out.println("4. Exit");
    System.out.print("Enter your choice (1/2/3/4): ");
    int choice = scanner.nextInt();
    switch (choice) {
        case 1:
            System.out.println("===== Pizza Order =====");
            pizzaRestaurant.menu();
            System.out.print("Enter Product ID: ");
            String pizzaId = scanner.next();
            System.out.print("Enter Product Name: ");
            String pizzaName = scanner.next();
            
            if (!pizzaName.equalsIgnoreCase("Margherita") && 
                    !pizzaName.equalsIgnoreCase("Pepperoni") && 
                    !pizzaName.equalsIgnoreCase("Veggie Supreme")) {
                    System.out.println("Error: " + pizzaName + " is not in the pizza menu!");
                    break;
                }
            pizzaRestaurant.orderManagement(pizzaId, pizzaName, "Home Delivery", 25.99, 30);
            pizzaRestaurant.homeDelivery("Swiggy");
            pizzaRestaurant.payment("Credit Card");
            pizzaRestaurant.offers("Buy 1 Get 1 Free");
            pizzaRestaurant.feedback("Amazing pizza!");
            pizzaRestaurant.getReceipt(pizzaId, pizzaName, "Home Delivery", 25.99, 30);
            break;

        case 2:
            System.out.println("===== Beverage Order =====");
            beverageRestaurant.menu();
            System.out.print("Enter Product ID: ");
            String beverageId = scanner.next();
            System.out.print("Enter Product Name: ");
            String beverageName = scanner.next();
            
            if (!beverageName.equalsIgnoreCase("Cola") && 
                    !beverageName.equalsIgnoreCase("Juice") && 
                    !beverageName.equalsIgnoreCase("Water")) {
                    System.out.println("Error: " + beverageName + " is not in the beverage menu!");
                    break;
                }
            beverageRestaurant.orderManagement(beverageId, beverageName, "Table Reservation", 10.99, 20);
            beverageRestaurant.homeDelivery("Zomato");
            beverageRestaurant.payment("Cash on Delivery");
            beverageRestaurant.offers("Happy Hour - 50% Off");
            beverageRestaurant.feedback("Refreshing drinks!");
            beverageRestaurant.getReceipt(beverageId, beverageName, "Table Reservation", 10.99, 20);
            break;

        case 3:
            System.out.println("===== Pizza and Beverage Order =====");
            pizzaRestaurant.menu();
            System.out.print("Enter Pizza Product ID: ");
            String pizzaIdBoth = scanner.next();
            System.out.print("Enter Pizza Product Name: ");
            String pizzaNameBoth = scanner.next();

            // Validate pizza name
            if (!pizzaNameBoth.equalsIgnoreCase("Margherita") && 
                !pizzaNameBoth.equalsIgnoreCase("Pepperoni") && 
                !pizzaNameBoth.equalsIgnoreCase("Veggie Supreme")) {
                System.out.println("Error: " + pizzaNameBoth + " is not in the pizza menu!");
                break;
            }

            beverageRestaurant.menu();
            System.out.print("Enter Beverage Product ID: ");
            String beverageIdBoth = scanner.next();
            System.out.print("Enter Beverage Product Name: ");
            String beverageNameBoth = scanner.next();

            // Validate beverage name
            if (!beverageNameBoth.equalsIgnoreCase("Cola") && 
                !beverageNameBoth.equalsIgnoreCase("Juice") && 
                !beverageNameBoth.equalsIgnoreCase("Water")) {
                System.out.println("Error: " + beverageNameBoth + " is not in the beverage menu!");
                break;
            }

            pizzaRestaurant.orderManagement(pizzaIdBoth, pizzaNameBoth, "Home Delivery", 25.99, 30);
            beverageRestaurant.orderManagement(beverageIdBoth, beverageNameBoth, "Table Reservation", 10.99, 20);

            pizzaRestaurant.homeDelivery("Swiggy");
            beverageRestaurant.homeDelivery("Zomato");
            pizzaRestaurant.payment("Credit Card");
            beverageRestaurant.payment("Cash on Delivery");
            pizzaRestaurant.offers("Buy 1 Get 1 Free");
            beverageRestaurant.offers("Happy Hour - 50% Off");
            pizzaRestaurant.feedback("Amazing pizza!");
            beverageRestaurant.feedback("Refreshing drinks!");
            pizzaRestaurant.getReceipt(pizzaIdBoth, pizzaNameBoth, "Home Delivery", 25.99, 30);
            beverageRestaurant.getReceipt(beverageIdBoth, beverageNameBoth, "Table Reservation", 10.99, 20);
            break;
        case 4:
            continueOrdering=false;
            System.out.println("Thank you for visiting our Restaurent!");
            break;
            
        default:
            System.out.println("Invalid choice! Please try again.");
            break;
    }
    if (continueOrdering && choice != 4) {
        System.out.print("\nWould you like to order anything else? (yes/no): ");
        String more = scanner.next().toLowerCase();
        continueOrdering = more.equals("yes");
    }
    }
}

}
