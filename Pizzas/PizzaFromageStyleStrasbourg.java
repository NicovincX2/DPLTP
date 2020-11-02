package Pizzas;

public class PizzaFromageStyleStrasbourg extends Pizza {
    public PizzaFromageStyleStrasbourg() {
        this.nom = "Pizza pâte style Strasbourg et fromage";
        this.pate = "Extra épaisse";
        this.sauce = "Sauce aux tomates cerise";
        this.garnitures.add("Lamelles de mozzarella");
    }

    public void couper() {
        System.out.println("Découpage en parts carrés");
    }
}
