package SuperCanard;

public class Leurre extends Canard{
    public Leurre(ComportementCancan cc, ComportementVol cv) {
        super(cc, cv);
    }

    public String afficher(){
        return "Canard en bois";
    }

    public String nager() {
        return "Je flotte";
    }
}
