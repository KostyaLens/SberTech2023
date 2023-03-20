package org.example;

public class Main {
    public static void main(String[] args) {
        PizzaOrder pizza = new PizzaOrder(PizzaOrder.Size.MEDDIUM, "Козленская33", true);
        pizza.order();
        pizza.order();
        pizza.cancel();
        pizza.cancel();
        System.out.println(pizza.toString());
    }
}