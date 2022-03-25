package SuperCanard;

public class Colvert extends Canard {
    public Colvert(ComportementCancan cc, ComportementVol cv) {
        super(cc, cv);
    }

    public String afficher() {
        // aspect d'un colvert
        return "Canard à tête verte";
    }

    public String nager() {
        return "Je nage";
    }
}
