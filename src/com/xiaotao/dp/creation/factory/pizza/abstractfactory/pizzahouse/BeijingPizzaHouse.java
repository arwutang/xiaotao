package com.xiaotao.dp.creation.factory.pizza.abstractfactory.pizzahouse;

import com.xiaotao.dp.creation.factory.pizza.abstractfactory.pizza.BeefPizza;
import com.xiaotao.dp.creation.factory.pizza.abstractfactory.pizza.CheesePizza;
import com.xiaotao.dp.creation.factory.pizza.abstractfactory.pizza.Pizza;
import com.xiaotao.dp.creation.factory.pizza.abstractfactory.vendor.BeijingPizzaVendor;

public class BeijingPizzaHouse extends PizzaHouse {
    @Override
    protected Pizza createPizza(String type) throws Exception {
        switch (type) {
            case "BeijingCheese":
                return new CheesePizza(new BeijingPizzaVendor());
            case "BeijingBeef":
                return new BeefPizza(new BeijingPizzaVendor());
            default:
                throw new Exception("Unknown type of Pizza");
        }
    }
}
