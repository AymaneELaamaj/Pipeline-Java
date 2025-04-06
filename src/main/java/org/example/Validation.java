package org.example;

public class Validation implements OrderProcessing{

    @Override
    public Order process(Order order) {
        if (order.amount==0){
            order.Statut="Invalid";
            return order;
        }
        return order;
    }
}
