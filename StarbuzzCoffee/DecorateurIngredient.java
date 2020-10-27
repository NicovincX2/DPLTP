package StarbuzzCoffee;

// Comme elle doit être interchangeable avec une Boisson, nous étendons la classe Boisson.
public abstract class DecorateurIngredient extends Boisson {
    // Nous allons aussi faire en sorte que les ingrédients (décorateurs) réimplémentent tous la méthode getDescription().
    public abstract String getDescription();
}
