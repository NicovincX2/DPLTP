package MeteoExpress;

import java.util.ArrayList;

public class DonneesMeteo implements Sujet {
    private ArrayList<Observateur> observateurs;
    private float temperature;
    private float humidite;
    private float pression;

    public DonneesMeteo() {
        this.observateurs = new ArrayList<Observateur>();
    }

    @Override
    public void enregistrerObservateur(Observateur o) {
        observateurs.add(o);
    }

    @Override
    public void supprimerObservateur(Observateur o) {
        int index = observateurs.indexOf(o);
        if (index >= 0) {
            observateurs.remove(index);
        }
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur o : this.observateurs) {
            o.actualiser(this.temperature, this.humidite, this.pression);
        }
    }

    /**
     * Cette méthode est appelée chaque fois que les mesures ont été mises à jour
     * (Nous ne savons pas comment cette méthode est appelée, et peu nous importe ;
     * nous savons simplement qu’elle l’est.)
     */
    public void actualiserMesures() {
        // Obtenir les mesures les plus récentes en appelant les méthodes get de
        // Donnees-Meteo (déjà implémentées).
        /*
         * float temp = getTemperature(); float humidite = getHumidite(); float pression
         * = getPression();
         */

        // Nous devons implémenter trois affichages qui utilisent les données
        // météorologiques : un affichage des conditions actuelles, un affichage des
        // statistiques et un affichage des prévisions. Ils doivent être mis à jour
        // chaque fois que DonneesMeteo acquiert de nouvelles données.
        // Le système doit être extensible : d’autres développeurs pourront créer des
        // affichages personnalisés et les utilisateurs pourront ajouter ou retirer
        // autant d’éléments qu’ils le souhaitent à l’application. Actuellement, nous ne
        // connaissons que les trois types d’affichage initiaux
        /*
         * affichageConditions.actualiser(temp, humidite, pression);
         * affichageStats.actualiser(temp, humidite, pression);
         * affichagePrevisions.actualiser(temp, humidite, pression);
         */

        notifierObservateurs();
    }

    public void setMesures(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
        actualiserMesures();
    }

}
