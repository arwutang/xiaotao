package com.xiaotaot.dp.creation.factory.pizza.factorymethod;

public class BeefPizza extends Pizza {
    @Override
    void prepare() {
        super.prepare();
        System.out.println("Put some beef here");
    }
}
