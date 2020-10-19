package MeteoExpressOO;

import java.util.Observable;

public class DonneesMeteo extends Observable {
    // Nous n’avons plus besoin de mémoriser nos observateurs ni de gérer leur ajout
    // et leur suppression : la superclasse s’en charge.
    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo() {
    }

    public void actualiserMesures() {
        // Nous appelons maintenant setChanged() pour indiquer que l’état a changé,
        // avant d’appeler notifyObservers().
        setChanged();

        // Remarquez que nous n’envoyons pas d’objet donnée avec l’appel de
        // notifyObservers(). Autrement dit, nous appliquons le modèle TIRER.
        // Si vous voulez « pousser » les données vers les observateurs, vous pouvez les
        // transmettre sous forme d’objet donnée à la méthode notifyObservers(arg).
        notifyObservers();
    }

    public void setMesures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        actualiserMesures();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidite() {
        return humidite;
    }

    public float getPression() {
        return pression;
    }
}
