package org.example;

public class Notification implements OrderProcessing {
    @Override
    public Order process(Order order) {
        if ("Shipped".equals(order.Statut)){
            System.out.println("Notifcation send");
        }
        return order;
    }
}
