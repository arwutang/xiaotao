package com.xiaotaot.dp.creation.factory.pizza.factorymethod;

public class CheesePizza extends Pizza {
    @Override
    void prepare() {
        super.prepare();
        System.out.println("Put some cheese here");
    }
}
