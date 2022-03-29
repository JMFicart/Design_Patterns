package SuperCanard;

public class Mandarin extends Canard implements Cloneable{
    public Mandarin(ComportementCancan cc, ComportementVol cv) {
        super(cc, cv);
    }

    public String afficher(){
        return "Canard multicolore";
    }

    public String nager() {
        return "Je nage";
    }

    public Mandarin clone() {
        Mandarin clone = null;
        try {
            clone = (Mandarin)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
