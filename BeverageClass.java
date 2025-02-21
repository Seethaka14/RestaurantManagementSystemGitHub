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
