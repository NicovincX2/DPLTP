package Pizzas;

public class PizzaTestDrive {
    public static void main(String[] args) {
        Pizzeria boutiqueBrest = new PizzeriaBrest();
        Pizzeria boutiqueStrasbourg = new PizzeriaStrasbourg();

        Pizza pizza = boutiqueBrest.commanderPizza("fromage");
        System.out.println("Luc a commandé une " + pizza.getNom() + "\n");

        pizza = boutiqueStrasbourg.commanderPizza("fromage");
        System.out.println("Michel a commandé une " + pizza.getNom() + "\n");
    }
}
