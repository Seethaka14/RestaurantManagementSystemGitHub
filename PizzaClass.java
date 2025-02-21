import java.util.Scanner;

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
