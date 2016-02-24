package com.xiaotao.dp.creation.factory.pizza.abstractfactory.vendor;

import com.xiaotao.dp.creation.factory.pizza.abstractfactory.bake.Bake;
import com.xiaotao.dp.creation.factory.pizza.abstractfactory.box.Box;


public abstract class PizzaVendor {
    public abstract Box createBox();

    public abstract Bake createBake();
}
