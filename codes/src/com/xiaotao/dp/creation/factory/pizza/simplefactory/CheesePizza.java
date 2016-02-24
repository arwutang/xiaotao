package com.xiaotao.dp.creation.factory.pizza.simplefactory;

public class CheesePizza extends Pizza {
    @Override
    void prepare() {
        super.prepare();
        System.out.println("Put some cheese here");
    }
}
