package MeteoExpressPCL;

import MeteoExpressPCL.Affichages.AffichageConditions;
import MeteoExpressPCL.Affichages.AffichagePrevisions;
import MeteoExpressPCL.Affichages.AffichageStats;

public class StationMeteo {
    public static void main(String[] args) {
        DonneesMeteo donneesMeteo = new DonneesMeteo();

        AffichageConditions affichageConditions = new AffichageConditions(donneesMeteo);
        AffichageStats affichageStats = new AffichageStats(donneesMeteo);
        AffichagePrevisions affichagePrevisions = new AffichagePrevisions(donneesMeteo);

        donneesMeteo.setMesures(26, 65, 1020);
        affichagePrevisions.afficher();
        affichageConditions.afficher();
        affichageStats.afficher();

        donneesMeteo.setMesures(28, 70, 1012);
        affichagePrevisions.afficher();
        affichageConditions.afficher();
        affichageStats.afficher();

        donneesMeteo.setMesures(22, 90, 1012);
        // On a encore Prevision : Depression bien installee et pas Prevision : Le temps
        // se rafraichit (pour this.currentPression == this.lastPression)
        // en effet, on n'update pas la pression car elle reste identique
        // il faut modifier le code pour update à chaque changement
        affichagePrevisions.afficher();
        affichageConditions.afficher();
        affichageStats.afficher();
    }
}
