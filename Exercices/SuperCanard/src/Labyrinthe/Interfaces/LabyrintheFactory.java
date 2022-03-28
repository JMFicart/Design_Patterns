package Labyrinthe.Interfaces;

public interface LabyrintheFactory {
    public default Mur createMur(){
        return null;
    }

    public default Porte createPorte(){
        return null;
    }

    public default Piece createPiece(){
        return null;
    }
}
