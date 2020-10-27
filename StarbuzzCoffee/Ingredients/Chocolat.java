package StarbuzzCoffee.Ingredients;

import StarbuzzCoffee.Boisson;
import StarbuzzCoffee.DecorateurIngredient;

// Chocolat est un décorateur : nous étendons DecorateurIngredient qui lui étend Boisson.
public class Chocolat extends DecorateurIngredient{
    Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return boisson.getDescription() + ", Chocolat";
    }

    public double count() {
        return 0.20 + boisson.count();
    }
}
