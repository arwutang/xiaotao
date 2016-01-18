package com.xiaotao.dp.creation.factory.pizza.abstractfactory;


import com.xiaotao.dp.creation.factory.pizza.abstractfactory.pizzahouse.BeijingPizzaHouse;
import com.xiaotao.dp.creation.factory.pizza.abstractfactory.pizzahouse.PizzaHouse;
import com.xiaotao.dp.creation.factory.pizza.abstractfactory.pizzahouse.ShanghaiPizzaHouse;

public class Main {
    public static void main(String args[]) throws Exception {
        PizzaHouse beijingPizzaHouse = new BeijingPizzaHouse();
        beijingPizzaHouse.orderPizza("BeijingBeef");

        PizzaHouse shanghaiPizzaHouse = new ShanghaiPizzaHouse();
        shanghaiPizzaHouse.orderPizza("ShanghaiCheese");
    }
}
