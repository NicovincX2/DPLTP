package StarbuzzCoffee.Ingredients;

import StarbuzzCoffee.Boisson;
import StarbuzzCoffee.DecorateurIngredient;

public class Lait extends DecorateurIngredient{
    Boisson boisson;

    public Lait(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return boisson.getDescription() + ", Lait";
    }

    public double count() {
        return 0.15 + boisson.count();
    }
}
