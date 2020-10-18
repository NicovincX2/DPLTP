package MeteoExpress;

public class AffichageConditions implements Observateur, Affichage {
    // Cet affichage implémente Observateur pour pouvoir obtenir les changements de
    // l’objet DonneesMeteo.
    private float temperature;
    private float humidite;
    // si nous voulons plus tard nous supprimer nous-même de la liste des
    // observateurs, ce sera pratique d’avoir déjà une référence au Sujet.
    private DonneesMeteo donneesMeteo;

    // Nous transmettons au constructeur l’objet DonneesMeteo (le Sujet) et nous
    // l’utilisons pour enregistrer l’affichage en tant qu’observateur.
    public AffichageConditions(DonneesMeteo donneesMeteo) {
        this.donneesMeteo = donneesMeteo;
        this.donneesMeteo.enregistrerObservateur(this);
    }

    // Quand actualiser() est appelée, nous sauvegardons température et humidité et
    // nous appelons afficher().
    @Override
    public void actualiser(float temperature, float humidite, float pression) {
        this.temperature = temperature;
        this.humidite = humidite;
        // Dans cet exemple simple, cela a un sens d’appeler afficher() quand les
        // valeurs changent. Mais vous avez raison : il y a de bien meilleures façons de
        // concevoir l’affichage des données. Nous les verrons quand nous aborderons le
        // pattern Modèle-Vue-Contrôleur.
        this.afficher();
    }

    @Override
    public void afficher() {
        System.out.println(
                "Conditions actuelles : " + this.temperature + " degrés C et " + this.humidite + " % d’humidité");
    }
}
