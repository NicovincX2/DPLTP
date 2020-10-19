package MeteoExpressOO;

import java.util.Observable;
import java.util.Observer;

import MeteoExpress.Affichage;

public class AffichageConditions implements Observer, Affichage {
    Observable observable;
    private float temperature;
    private float humidite;

    public AffichageConditions(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    // Nous avons modifié la méthode update() pour qu’elle accepte en argument à la
    // fois un Observable et des données optionnelles.
    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof DonneesMeteo) {
            DonneesMeteo donneesMeteo = (DonneesMeteo) observable;
            this.temperature = donneesMeteo.getTemperature();
            this.humidite = donneesMeteo.getHumidite();

            this.afficher();
        }
    }

    @Override
    public void afficher() {
        System.out.println(
                "Conditions actuelles : " + this.temperature + " degrés C et " + this.humidite + " % d’humidité");
    }
}
