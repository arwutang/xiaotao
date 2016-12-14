package com.xiaotaot.dp.creation.factory.pizza.simplefactory;

/**
 * Note: static of not
 *
 * Good for not static: we can change the creation behaviour by inherit
 */
public class SimplePizzaFactory {
    private static SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();

    private SimplePizzaFactory() {
    }

    public static SimplePizzaFactory getInstance() {
        return simplePizzaFactory;
    }

    public Pizza createPizza(String type) throws Exception {
        Pizza pizza;

        switch (type) {
            case "CHEESE":
                pizza = new CheesePizza();
                break;
            case "BEEF":
                pizza = new BeefPizza();
                break;
            default:
                throw new Exception("Unknown type of Pizza");
        }

        return pizza;
    }
}
