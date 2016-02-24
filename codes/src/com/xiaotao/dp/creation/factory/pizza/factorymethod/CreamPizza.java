package com.xiaotao.dp.creation.factory.pizza.factorymethod;

public class CreamPizza extends Pizza {
    @Override
    void prepare() {
        super.prepare();
        System.out.println("Put some cream here");
    }
}
