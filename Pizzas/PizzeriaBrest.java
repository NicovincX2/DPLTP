package Pizzas;

public class PizzeriaBrest extends Pizzeria {
    
    protected Pizza creerPizza(String type) {
        if (type.equals("fromage")) {
            return new PizzaFromageStyleBrest();
        } else if (type.equals("vegetarienne")) {
            return new PizzaVegetarienneStyleBrest();
        } else if (type.equals("fruitsDeMer")) {
            return new PizzaFruitsDeMerStyleBrest();
        } else if (type.equals("poivrons")) {
            return new PizzaPoivronsStyleBrest();
        } else {
            return null;
        }
    }
}
