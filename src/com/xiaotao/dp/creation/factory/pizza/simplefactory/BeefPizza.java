package com.xiaotao.dp.creation.factory.pizza.simplefactory;

public class BeefPizza extends Pizza {
    @Override
    void prepare() {
        super.prepare();
        System.out.println("Put some beef here");
    }
}
