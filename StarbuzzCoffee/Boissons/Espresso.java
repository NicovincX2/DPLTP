package StarbuzzCoffee.Boissons;

import StarbuzzCoffee.Boisson;

public class Espresso extends Boisson {
    public Espresso() {
        setDescription("Espresso");
    }
    public double count() {
        return 1.99;
    }
}
