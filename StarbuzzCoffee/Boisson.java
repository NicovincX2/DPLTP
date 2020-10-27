package StarbuzzCoffee;

public abstract class Boisson {

    public enum Taille {
        PETIT,
        MOYEN,
        GRAND
    }

    String description = "Boisson inconnue";
    Taille taille = Taille.MOYEN;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public abstract double count();

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }
}