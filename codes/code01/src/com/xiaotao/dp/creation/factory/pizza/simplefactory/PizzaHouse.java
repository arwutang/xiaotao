package com.xiaotao.dp.creation.factory.pizza.simplefactory;


public class PizzaHouse {
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaHouse(SimplePizzaFactory simplePizzaFactory) {
        System.out.println("=== Welcome to a pizza house. Use Simple Factory ===");
        this.simplePizzaFactory = simplePizzaFactory;
    }

//    public Pizza orderPizzaBadBadBad(String type) throws Exception {
//        Pizza pizza;
//
//        // here is what we change
//        // 1. add new type of pizza
//        // 2. remove some pizza no long sold
//        switch (type) {
//            case "CHEESE":
//                pizza = new CheesePizza();
//                break;
//            case "BEEF":
//                pizza = new BeefPizza();
//                break;
//            default:
//                throw new Exception("Unknown type of Pizza");
//        }
//
//        // here is not change
//        pizza.prepare();
//        pizza.bake();
//        pizza.box();
//
//        return pizza;
//    }

    public Pizza orderPizza(String type) throws Exception {
        Pizza pizza = simplePizzaFactory.createPizza(type);

        // here is not change
        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}
