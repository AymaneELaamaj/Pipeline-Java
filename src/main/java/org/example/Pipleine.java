package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pipleine {
    List<OrderProcessing> stages=new ArrayList<>();
    public Pipleine addstage(OrderProcessing stage){
        stages.add(stage);
        return this;
    }
    public Order execute(Order order){
        for (OrderProcessing stage:stages){
            order=stage.process(order);
            if ("Invalid".equals(order.Statut) || "Failed".equals(order.Statut)){
                break;
            }


        }
        return order;
    }
}
