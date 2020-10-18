package MeteoExpress;

public class AffichagePrevisions implements Observateur, Affichage {
    private float currentPression = 1012;
    private float lastPression;
    private DonneesMeteo donneesMeteo;

    public AffichagePrevisions(DonneesMeteo donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        this.donneesMeteo.enregistrerObservateur(this);
    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {
        this.lastPression = this.currentPression;
        this.currentPression = pression;

        this.afficher();
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
