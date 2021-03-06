package MeteoExpressPCL.Affichages;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import MeteoExpressPCL.Affichage;
import MeteoExpressPCL.DonneesMeteo;

public class AffichagePrevisions implements PropertyChangeListener, Affichage {
    private float currentPression = 1012;
    private float lastPression;

    public AffichagePrevisions(DonneesMeteo donneesMeteo) {
        donneesMeteo.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("pression")) {
            // System.out.println("Variation of " + evt.getPropertyName());
            // System.out.println("\t(" + evt.getOldValue() + " -> " + evt.getNewValue() +
            // ")");
            this.lastPression = this.currentPression;
            this.currentPression = (float) evt.getNewValue();
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
