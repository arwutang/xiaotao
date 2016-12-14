package com.xiaotaot.dp.creation.factory.pizza.factorymethod;


public class Main {
    public static void main(String args[]) throws Exception {
        PizzaHouse beijingPizzaHouse = new BeijingPizzaHouse();
        beijingPizzaHouse.orderPizza("BeijingBeef");

        PizzaHouse shanghaiPizzaHouse = new ShanghaiPizzaHouse();
        shanghaiPizzaHouse.orderPizza("ShanghaiCheese");
    }
}
