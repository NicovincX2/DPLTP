package StarbuzzCoffee.Ingredients;

import StarbuzzCoffee.Boisson;
import StarbuzzCoffee.DecorateurIngredient;

public class Lait extends DecorateurIngredient{
    Boisson boisson;

    public Lait(Boisson boisson) {
        this.boisson = boisson;
    }

    public Boisson.Taille getTaille() {
        return boisson.getTaille();
    }

    public String getDescription() {
        return boisson.getDescription() + ", Lait";
    }

    public double count() {
        double count = boisson.count();
        if (getTaille() == Boisson.Taille.PETIT) {
            count += 0.15;
        } else if (getTaille() == Boisson.Taille.MOYEN) {
            count += 0.30;
        } else if (getTaille() == Boisson.Taille.GRAND) {
            count += 0.45;
        }
        return count;
    }
}
