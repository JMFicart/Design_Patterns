package SuperCanard;

public class Main {
    public static void main(String[] args) {
        ComportementVol volerAvecAile;
        ComportementVol nePasVoler;

        ComportementCancan cancan;
        ComportementCancan coincoin;
        ComportementCancan canardMuet;

        {
            volerAvecAile = new VolerAvecDesAiles();
            nePasVoler = new NePasVoler();

            cancan = new Cancan();
            coincoin = new Coincoin();
            canardMuet = new CanardMuet();
        }

        Canard[] mare = new Canard[]{
                new Colvert(coincoin, volerAvecAile),
                new Mandarin(cancan, volerAvecAile),
                new CanardEnPlastique(coincoin, nePasVoler),
                new Leurre(canardMuet, nePasVoler)
        };

        for (Canard c : mare){
            System.out.println("Nager : " + c.nager());
            System.out.println("Aspect : " + c.afficher());
            System.out.println("Son : " + c.cancaner());
            System.out.println("Vol : " + c.voler());
            System.out.println("");
        }
    }
}
