package Labyrinthe.Visitor;

import Labyrinthe.Interfaces.Mur;
import Labyrinthe.Interfaces.Piece;
import Labyrinthe.Interfaces.Porte;

public interface LabyrintheVisitor {
    void visiteMur(Mur mur);
    void visitePiece(Piece piece);
    void visitePorte(Porte porte);
}
