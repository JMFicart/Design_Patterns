package Labyrinthe.Builder;

import Labyrinthe.Interfaces.LabyrintheElement;
import Labyrinthe.Interfaces.Mur;
import Labyrinthe.Interfaces.Piece;
import Labyrinthe.Interfaces.Porte;
import Labyrinthe.Visitor.LabyrintheVisitor;

public class Joueur implements LabyrintheVisitor {
    private Labyrinthe game = null;
    private LabyrintheElement state;

    public Joueur(Labyrinthe game){
        this.game = game;
    }

    @Override
    public void visiteMur(Mur mur) {

    }

    @Override
    public void visitePiece(Piece piece) {

    }

    @Override
    public void visitePorte(Porte porte) {

    }

    public boolean isFinish(){
        return true;
    }

    public void move(Direction d){
        LabyrintheElement element = game.getElement(state, d);
        element.accepterVisiteur(this);
    }
}
