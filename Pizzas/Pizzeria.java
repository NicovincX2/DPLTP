package Pizzas;

public abstract class Pizzeria {

    /**
     * commanderPizza() est définie dans la classe abstraite Pizzeria, pas dans les 
     * sous-classes. La méthode n’a donc aucune idée de la sous-classe qui exécute 
     * réellement le code et qui fabrique les pizzas.
     */ 
    public Pizza commanderPizza(String type) {
        Pizza pizza;
        
        pizza = creerPizza(type);
        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.emballer();

        return pizza;
    }

    protected abstract Pizza creerPizza(String pizza);
}
