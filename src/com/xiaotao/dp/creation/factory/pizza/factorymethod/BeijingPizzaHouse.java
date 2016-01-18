package com.xiaotao.dp.creation.factory.pizza.factorymethod;

public class BeijingPizzaHouse extends PizzaHouse {
    @Override
    protected Pizza createPizza(String type) throws Exception {
        switch (type) {
            case "BeijingCheese":
                return new CheesePizza();
            case "BeijingBeef":
                return new BeefPizza();
            default:
                throw new Exception("Unknown type of Pizza");
        }
    }
}
