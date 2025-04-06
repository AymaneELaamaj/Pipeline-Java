package org.example;

public class Shipping implements OrderProcessing{
    @Override
    public Order process(Order order) {
        if ("Paid".equals(order.Statut)){
            order.Statut="Shipped";
            System.out.println("order shipped"+order);
        }
        else {
            order.Statut="Failed";
            System.out.println("order Failed"+order);
        }
        return order;
    }
}
