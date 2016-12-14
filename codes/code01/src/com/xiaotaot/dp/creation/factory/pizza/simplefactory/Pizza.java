package com.xiaotaot.dp.creation.factory.pizza.simplefactory;

public abstract class Pizza {
    void prepare() {
        System.out.println("***** Prepare pizza now!");
    }

    void bake() {
        System.out.println("***** Bake pizza now!");
    }

    void box() {
        System.out.println("***** Box pizza now!");
    }
}
