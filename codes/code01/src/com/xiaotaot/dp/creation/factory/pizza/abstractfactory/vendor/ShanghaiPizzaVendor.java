package com.xiaotaot.dp.creation.factory.pizza.abstractfactory.vendor;

import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.bake.Bake;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.bake.BeijingBake;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.box.Box;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.box.ShanghaiBox;


public class ShanghaiPizzaVendor extends PizzaVendor {
    public Box createBox() {
        return new ShanghaiBox();
    }

    public Bake createBake() {
        return new BeijingBake();
    }
}
