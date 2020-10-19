package MeteoExpressPCL;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class DonneesMeteo {
    private float temperature;
    private float humidite;
    private float pression;
    // In this implementation, an observable must keep a reference to the
    // PropertyChangeSupport instance. It helps to send the notifications to
    // observers when a property of the class is changed.
    private PropertyChangeSupport support;

    public DonneesMeteo() {
        this.support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        this.support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        this.support.removePropertyChangeListener(pcl);
    }

    public void setTemperature(float temperature) {
        // on update si la température ne change pas pour le calcul de la moyenne
        if (this.temperature == temperature) {
            this.temperature = 0.0f; // equal default float value
        }
        // Here, the first argument is the name of the observed property. The second and
        // the third arguments are its old and new value accordingly.
        this.support.firePropertyChange("temperature", this.temperature, temperature);
        this.temperature = temperature;
    }

    public void setHumidite(float humidite) {
        // Here, the first argument is the name of the observed property. The second and
        // the third arguments are its old and new value accordingly.
        this.support.firePropertyChange("humidite", this.humidite, humidite);
        this.humidite = humidite;
    }

    public void setPression(float pression) {
        // on update si la pression ne change pas pour l'affichage des prévisions
        if (this.pression == pression) {
            this.pression = 0.0f; // equal default float value
        }
        // Here, the first argument is the name of the observed property. The second and
        // the third arguments are its old and new value accordingly.
        this.support.firePropertyChange("pression", this.pression, pression);
        this.pression = pression;
    }

    public void setMesures(float temperature, float humidite, float pression) {
        this.setTemperature(temperature);
        this.setHumidite(humidite);
        this.setPression(pression);
    }
}
