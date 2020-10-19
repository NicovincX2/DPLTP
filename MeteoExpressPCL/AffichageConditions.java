package MeteoExpressPCL;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import MeteoExpress.Affichage;

public class AffichageConditions implements PropertyChangeListener, Affichage {
    private float temperature;
    private float humidite;
    DonneesMeteo donneesMeteo;

    public AffichageConditions(DonneesMeteo donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        this.donneesMeteo.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        /*
         * System.out.println("Variation of " + evt.getPropertyName());
         * System.out.println("\t(" + evt.getOldValue() + " -> " + evt.getNewValue() +
         * ")"); System.out.println("Property in object " + evt.getSource());
         */
        if (evt.getPropertyName().equals("temperature")) {
            this.temperature = (float) evt.getNewValue();
        }
        if (evt.getPropertyName().equals("humidite")) {
            this.humidite = (float) evt.getNewValue();
        }
    }

    @Override
    public void afficher() {
        System.out.println(
                "Conditions actuelles : " + this.temperature + " degrés C et " + this.humidite + " % d’humidité");
    }
}
