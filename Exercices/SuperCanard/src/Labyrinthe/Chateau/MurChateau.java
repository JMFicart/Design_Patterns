package Labyrinthe.Chateau;

import Labyrinthe.AbstractLabyrintheElement;
import Labyrinthe.Builder.Joueur;
import Labyrinthe.Interfaces.Mur;
import Labyrinthe.Visitor.LabyrintheVisitor;

public class MurChateau extends AbstractLabyrintheElement implements Mur {
    @Override
    public String getDescription() {
        return "Mur chateau";
    }

    @Override
    public void accepterVisiteur(LabyrintheVisitor visitor) {

    }

    @Override
    public void setPosition() {

    }


}
