package MeteoExpressOO.Affichages;

import java.util.Observable;
import java.util.Observer;

import MeteoExpressOO.Affichage;
import MeteoExpressOO.DonneesMeteo;

public class AffichageStats implements Observer, Affichage {
    Observable observable;
    private float temperatureMax = 0.0f;
    private float temperatureMin = 200;
    private float temperatureSum = 0.0f;
    private int actualisationCount;

    public AffichageStats(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof DonneesMeteo) {
            DonneesMeteo donneesMeteo = (DonneesMeteo) observable;
            float temperature = donneesMeteo.getTemperature();

            this.temperatureSum += temperature;
            this.actualisationCount++;

            if (temperature > this.temperatureMax) {
                this.temperatureMax = temperature;
            }
            if (temperature < this.temperatureMin) {
                this.temperatureMin = temperature;
            }
            this.afficher();
        }
    }

    @Override
    public void afficher() {
        String avg = String.format("%.1f", (this.temperatureSum / this.actualisationCount));
        System.out.println("Temperature Moy/Max/Min = " + avg + "/"
                + this.temperatureMax + "/" + this.temperatureMin);
    }
}
