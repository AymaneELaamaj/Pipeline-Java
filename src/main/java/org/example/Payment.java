package org.example;

public class Payment implements OrderProcessing {

    @Override
    public Order process(Order order) {
        return order;
    }
}
