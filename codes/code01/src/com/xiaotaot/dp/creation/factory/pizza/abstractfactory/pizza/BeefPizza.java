package com.xiaotaot.dp.creation.factory.pizza.abstractfactory.pizza;

import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.vendor.PizzaVendor;

public class BeefPizza extends Pizza {
    public BeefPizza(PizzaVendor vendor) {
        super(vendor);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Put some beef here");
    }
}
