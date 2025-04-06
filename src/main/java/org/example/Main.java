package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order=new Order("A1",12);
        Pipleine pipleine = new Pipleine();
        pipleine.addstage(new Validation());
        pipleine.addstage(new Payment());
        pipleine.addstage(new Shipping());
        pipleine.execute(order);


    }
}