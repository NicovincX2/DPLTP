package MeteoExpressPCL.Affichages;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import MeteoExpressPCL.Affichage;
import MeteoExpressPCL.DonneesMeteo;

public class AffichageStats implements PropertyChangeListener, Affichage {
    private float temperatureMax = 0.0f;
    private float temperatureMin = 200;
    private float temperatureSum = 0.0f;
    private int actualisationCount;

    public AffichageStats(DonneesMeteo donneesMeteo) {
        donneesMeteo.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        /*
         * System.out.println("Variation of " + evt.getPropertyName());
         * System.out.println("\t(" + evt.getOldValue() + " -> " + evt.getNewValue() +
         * ")"); System.out.println("Property in object " + evt.getSource());
         */
        if (evt.getPropertyName().equals("temperature")) {
            float temperature = (float) evt.getNewValue();
            this.temperatureSum += temperature;
            this.actualisationCount++;

            if (temperature > this.temperatureMax) {
                this.temperatureMax = temperature;
            }
            if (temperature < this.temperatureMin) {
                this.temperatureMin = temperature;
            }
        }
    }

    @Override
    public void afficher() {
        String avg = String.format("%.1f", (this.temperatureSum / this.actualisationCount));
        System.out.println("Temperature Moy/Max/Min = " + avg + "/" + this.temperatureMax + "/" + this.temperatureMin);
    }
}
