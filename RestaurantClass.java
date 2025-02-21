class Restaurant {
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

