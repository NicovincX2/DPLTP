package MeteoExpress;

public class AffichageStats implements Observateur, Affichage {
    private float temperatureMax = 0.0f;
    private float temperatureMin = 200;
    private float temperatureSum = 0.0f;
    private int actualisationCount;
    private DonneesMeteo donneesMeteo;

    public AffichageStats(DonneesMeteo donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        this.donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {
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

    @Override
    public void afficher() {
        String avg = String.format("%.1f", (this.temperatureSum / this.actualisationCount));
        System.out.println("Temperature Moy/Max/Min = " + avg + "/"
                + this.temperatureMax + "/" + this.temperatureMin);
    }
}
