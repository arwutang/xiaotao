package com.xiaotao.dp.creation.factory.pizza.abstractfactory.pizza;

import com.xiaotao.dp.creation.factory.pizza.abstractfactory.vendor.PizzaVendor;

public class CheesePizza extends Pizza {
    public CheesePizza(PizzaVendor vendor) {
        super(vendor);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Put some cheese here");
    }
}
