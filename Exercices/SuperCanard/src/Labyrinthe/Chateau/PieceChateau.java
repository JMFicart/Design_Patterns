package Labyrinthe.Chateau;

import Labyrinthe.AbstractLabyrintheElement;
import Labyrinthe.Builder.Joueur;
import Labyrinthe.Interfaces.Piece;
import Labyrinthe.Visitor.LabyrintheVisitor;

public class PieceChateau extends AbstractLabyrintheElement implements Piece {
    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void accepterVisiteur(LabyrintheVisitor visitor) {

    }

    @Override
    public void setPosition() {

    }
}
