package SuperCanard;

public class Mandarin extends Canard{
    public Mandarin(ComportementCancan cc, ComportementVol cv) {
        super(cc, cv);
    }

    public String afficher(){
        return "Canard multicolore";
    }

    public String nager() {
        return "Je nage";
    }
}
