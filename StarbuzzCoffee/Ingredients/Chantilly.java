package StarbuzzCoffee.Ingredients;

import StarbuzzCoffee.Boisson;
import StarbuzzCoffee.DecorateurIngredient;

public class Chantilly extends DecorateurIngredient{
    Boisson boisson;

    public Chantilly(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return boisson.getDescription() + ", Chantilly";
    }

    public double count() {
        return 0.10 + boisson.count();
    }
}
