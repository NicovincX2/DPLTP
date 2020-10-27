package StarbuzzCoffee;

public abstract class Boisson {
    String description = "Boisson inconnue";

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public abstract double count();
}