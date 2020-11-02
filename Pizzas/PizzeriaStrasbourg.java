package Pizzas;

public class PizzeriaStrasbourg extends Pizzeria {
    protected Pizza creerPizza(String type) {
        if (type.equals("fromage")) {
            return new PizzaFromageStyleStrasbourg();
        } else if (type.equals("vegetarienne")) {
            return new PizzaVegetarienne();
        } else if (type.equals("fruitsDeMer")) {
            return new PizzaFruitsDeMer();
        } else if (type.equals("poivrons")) {
            return new PizzaPoivrons();
        } else {
            return null;
        }
    }
}
