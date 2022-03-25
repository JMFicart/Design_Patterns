package SuperCanard;

public class NePasVoler implements ComportementVol{

    @Override
    public String voler() {
        // ne rien faire - le canard ne peut pas voler !
        return "Je ne vole pas";
    }
}
