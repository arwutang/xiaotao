package com.xiaotao.dp.creation.factory.pizza.factorymethod;

public class ShanghaiPizzaHouse extends PizzaHouse {
    @Override
    protected Pizza createPizza(String type) throws Exception {
        switch (type) {
            case "ShanghaiCheese":
                return new CheesePizza();
            case "ShanghaiCream":
                return new CreamPizza();
            default:
                throw new Exception("Unknown type of Pizza");
        }
    }
}
