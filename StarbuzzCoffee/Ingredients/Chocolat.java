package StarbuzzCoffee.Ingredients;

import StarbuzzCoffee.Boisson;
import StarbuzzCoffee.DecorateurIngredient;

// Chocolat est un décorateur : nous étendons DecorateurIngredient qui lui étend Boisson.
public class Chocolat extends DecorateurIngredient{
    Boisson boisson;

    public Chocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    public Boisson.Taille getTaille() {
        return boisson.getTaille();
    }

    public String getDescription() {
        return boisson.getDescription() + ", Chocolat";
    }

    public double count() {
        double count = boisson.count();
        if (getTaille() == Boisson.Taille.PETIT) {
            count += 0.20;
        } else if (getTaille() == Boisson.Taille.MOYEN) {
            count += 0.30;
        } else if (getTaille() == Boisson.Taille.GRAND) {
            count += 0.40;
        }
        return count;
    }
}
