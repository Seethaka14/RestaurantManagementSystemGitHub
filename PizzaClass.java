package vehicle;

class Pizzases extends Restaurant {
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
	     super.orderManagement(productId, productName, deliveryType, totalAmount, TTT); 
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