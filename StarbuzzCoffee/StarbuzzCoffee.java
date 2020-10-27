package StarbuzzCoffee;

import StarbuzzCoffee.Boissons.Colombia;
import StarbuzzCoffee.Boissons.Espresso;
import StarbuzzCoffee.Boissons.Sumatra;
import StarbuzzCoffee.Ingredients.Caramel;
import StarbuzzCoffee.Ingredients.Chantilly;
import StarbuzzCoffee.Ingredients.Chocolat;

public class StarbuzzCoffee {
    public static void main(String args[]) {
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescription() + " €" + boisson.count());
        
        Boisson boisson2 = new Sumatra();
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chocolat(boisson2);
        boisson2 = new Chantilly(boisson2);
        System.out.println(boisson2.getDescription() + " €" + boisson2.count());

        Boisson boisson3 = new Colombia();
        boisson3 = new Caramel(boisson3);
        boisson3 = new Chocolat(boisson3);
        boisson3 = new Chantilly(boisson3);
        System.out.println(boisson3.getDescription() + " €" + boisson3.count());
    }
}
