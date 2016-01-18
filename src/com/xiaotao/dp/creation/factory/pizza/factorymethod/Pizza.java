package com.xiaotao.dp.creation.factory.pizza.factorymethod;

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
