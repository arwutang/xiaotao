package com.xiaotaot.dp.creation.factory.pizza.abstractfactory.pizza;

import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.bake.Bake;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.box.Box;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.vendor.PizzaVendor;

public abstract class Pizza {
    private PizzaVendor vendor;
    private Box pizzaBox;
    private Bake pizzaBake;

    public Pizza(PizzaVendor vendor) {
        this.vendor = vendor;
    }

    public void prepare() {
        System.out.println("***** Prepare pizza now!");
        this.pizzaBox = vendor.createBox();
        this.pizzaBake = vendor.createBake();
    }

    public void bake() {
        System.out.println("***** Bake pizza now!");
        System.out.println("The Bake is " + pizzaBox);
    }

    public void box() {
        System.out.println("***** Box pizza now!");
        System.out.println("The Box is " + pizzaBake);
    }
}
