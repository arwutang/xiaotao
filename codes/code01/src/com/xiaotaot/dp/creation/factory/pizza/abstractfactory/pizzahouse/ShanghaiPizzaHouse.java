package com.xiaotaot.dp.creation.factory.pizza.abstractfactory.pizzahouse;

import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.pizza.CheesePizza;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.pizza.CreamPizza;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.pizza.Pizza;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.vendor.ShanghaiPizzaVendor;

public class ShanghaiPizzaHouse extends PizzaHouse {
    @Override
    protected Pizza createPizza(String type) throws Exception {
        switch (type) {
            case "ShanghaiCheese":
                return new CheesePizza(new ShanghaiPizzaVendor());
            case "ShanghaiCream":
                return new CreamPizza(new ShanghaiPizzaVendor());
            default:
                throw new Exception("Unknown type of Pizza");
        }
    }
}
