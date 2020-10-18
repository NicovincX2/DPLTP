package SuperCanard;

public abstract class Canard {
    ComportementVol comportementVol;
    ComportementCancan comportementCancan;

    public Canard() {
    }

    public void setComportementVol(ComportementVol cv) {
        comportementVol = cv;
    }

    public void setComportementCancan(ComportementCancan cc) {
        comportementCancan = cc;
    }

    public abstract void afficher();

    public void effectuerVol() {
        comportementVol.voler();
    }

    public void effectuerCancan() {
        comportementCancan.cancaner();
    }

    public void nager() {
        System.out.println("Tous les canards flottent, mêmes les leurres!");
    }
}