package SuperCanard;

public class Canard {
    ComportementVol comportementVol;
    ComportementCancan comportementCancan;

    public Canard(ComportementCancan cc, ComportementVol cv){
        setComportementCancan(cc);
        setComportementVol(cv);
    }

    public String nager(){return "";}

    public String afficher(){return "";}

    public String cancaner(){
        return comportementCancan.cancaner();
    }

    public String voler(){
        return comportementVol.voler();
    }

    public void setComportementVol(ComportementVol cv){
        comportementVol = cv;
    }

    public void setComportementCancan(ComportementCancan cc){
        comportementCancan = cc;
    }

    public ComportementCancan getComportementCancan() {
        return comportementCancan;
    }

    public Object clone() throws CloneNotSupportedException {
        Canard clone = (Canard) super.clone();
        clone.comportementCancan = (ComportementCancan) getComportementCancan().clone();
        return clone;
    }
    // Autres méthodes propres aux canards ...
}
