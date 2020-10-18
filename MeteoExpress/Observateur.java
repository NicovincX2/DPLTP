package MeteoExpress;

public interface Observateur {
    // Les valeurs de l’état que les Observateurs obtiennent du Sujet quand une
    // mesure change
    public void actualiser(float temperature, float humidite, float pression);
}