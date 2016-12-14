package com.xiaotaot.dp.creation.factory.pizza.factorymethod;


public abstract class PizzaHouse {
    public PizzaHouse() {
        System.out.println("=== Welcome to a pizza house. Use Factory Method ===");
    }

    public Pizza orderPizza(String type) throws Exception {
        Pizza pizza = createPizza(type);

        // here is not change
        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type) throws Exception;
}
