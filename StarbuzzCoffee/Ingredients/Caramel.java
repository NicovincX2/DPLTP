package StarbuzzCoffee.Ingredients;

import StarbuzzCoffee.Boisson;
import StarbuzzCoffee.DecorateurIngredient;

public class Caramel extends DecorateurIngredient{
    Boisson boisson;

    public Caramel(Boisson boisson) {
        this.boisson = boisson;
    }

    public String getDescription() {
        return boisson.getDescription() + ", Caramel";
    }

    public double count() {
        return 0.15 + boisson.count();
    }
}
