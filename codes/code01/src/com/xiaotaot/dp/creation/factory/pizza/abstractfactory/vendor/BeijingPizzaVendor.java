package com.xiaotaot.dp.creation.factory.pizza.abstractfactory.vendor;

import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.bake.Bake;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.bake.BeijingBake;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.box.BeijingBox;
import com.xiaotaot.dp.creation.factory.pizza.abstractfactory.box.Box;


public class BeijingPizzaVendor extends PizzaVendor {
    public Box createBox() {
        return new BeijingBox();
    }

    public Bake createBake() {
        return new BeijingBake();
    }
}
