package MeteoExpressOO.Affichages;

import java.util.Observable;
import java.util.Observer;

import MeteoExpressOO.Affichage;
import MeteoExpressOO.DonneesMeteo;

public class AffichagePrevisions implements Observer, Affichage {
    Observable observable;
    private float currentPression = 1012;
    private float lastPression;

    public AffichagePrevisions(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof DonneesMeteo) {
            DonneesMeteo donneesMeteo = (DonneesMeteo) observable;
            this.lastPression = this.currentPression;
            this.currentPression = donneesMeteo.getPression();

            this.afficher();
        }
    }

    @Override
    public void afficher() {
        System.out.print("Prevision : ");
        if (this.currentPression > this.lastPression) {
            System.out.println("Amelioration en cours !");
        } else if (this.currentPression == this.lastPression) {
            System.out.println("Le temps se rafraichit");
        } else if (this.currentPression < this.lastPression) {
            System.out.println("Depression bien installee");
        }
    }
}
