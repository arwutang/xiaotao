package com.xiaotaot.dp.creation.factory.pizza.simplefactory;

public class Main {
    public static void main(String args[]) throws Exception {
        PizzaHouse pizzaHouse = new PizzaHouse(SimplePizzaFactory.getInstance());
        pizzaHouse.orderPizza("CHEESE");
    }
}
