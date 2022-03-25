package SuperCanard;

public class CanardEnPlastique extends Canard{
    public CanardEnPlastique(ComportementCancan cc, ComportementVol cv) {
        super(cc, cv);
    }

    public String afficher(){
        return "Canard en plastique jaune";
    }

    public String nager() {
        return "Je flotte";
    }
}
