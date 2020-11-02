package Pizzas;

import java.util.ArrayList;

public abstract class Pizza {
    String nom;
    String pate;
    String sauce;
    ArrayList garnitures = new ArrayList<>();

    public void preparer() {
        System.out.println("Préparation de " + this.nom);
        System.out.println("Etalage de la pâte...");
        System.out.println("Ajout de la sauce...");
        System.out.println("Ajoût des garnitures: ");
        for (int i = 0; i < this.garnitures.size(); i++) {
            System.out.println(" " + this.garnitures.get(i));
        }
    }
    public void cuire() {
        System.out.println("Cuisson 25min à 180°");
    }
    public void couper() {
        System.out.println("Découpage en parts triangulaires");
    }
    public void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }

    public String getNom() {
        return nom;
    }
}
