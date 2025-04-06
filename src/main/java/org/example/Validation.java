package org.example;

public class Validation implements OrderProcessing{

    @Override
    public Order process(Order order) {
        if (order.amount==0){
            order.Statut="Invalid";
            System.out.println("Order Invalid "+order);
        }
        else {
            order.Statut="Valid";
            System.out.println("Order Valid "+order);


        }
        return order;
    }
}
