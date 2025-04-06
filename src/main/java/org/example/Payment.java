package org.example;

public class Payment implements OrderProcessing {
    @Override
    public Order process(Order order) {
        if ("Valid".equals(order.Statut)){
            order.Statut="Paid";
            System.out.println("Payment Proccesed "+order);
        }else {
            order.Statut="Failed";
            System.out.println("Payment Failed "+order);
        }
        return order;
    }
}
