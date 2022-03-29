package SuperCanard;

public class Begayer implements ComportementCancan {
    String cc;

    public Begayer(ComportementCancan comportementCancan) {
        cc = comportementCancan.cancaner() + " " + comportementCancan.cancaner();
    }

    @Override
    public String cancaner() {
        // Implémente le cancanement.
        return cc;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
