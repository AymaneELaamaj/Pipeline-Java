package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    String ID;
    int amount;
    String Statut;
    public Order(String ID, int amount) {
        this.ID = ID;
        this.amount = amount;
        Statut = "new";
    }
    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", amount=" + amount +
                ", Statut='" + Statut + '\'' +
                '}';
    }


}
