package vehicle;
class Beverage extends Restaurant {
@Override
void menu() {
   super.menu(); 
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
void getReceipt(String productId, String productName, String deliveryType, double totalAmount, int TTT) {
    System.out.println("===== Receipt =====");
    System.out.println("Product ID: " + productId);
    System.out.println("Product Name: " + productName);
    System.out.println("Delivery Type: " + deliveryType);
    System.out.println("Total Amount: $" + totalAmount);
    System.out.println("Time to Prepare: " + TTT + " minutes");
    System.out.println("======================");
    System.out.println("Bill received. Thank you for your order!");
    System.out.println("======================");
}
}


