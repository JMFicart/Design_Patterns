package Labyrinthe.Builder;

import Labyrinthe.Interfaces.LabyrintheFactory;

public interface LabyrintheBuilder {
    void begin(int nbLig, int nbCol, LabyrintheFactory Factory);
    void addMur(int lig, int col);
    void addPorte(int lig, int col);
    void addPiece(int lig, int log);
    void end();
    Labyrinthe getLabyrinthe();
}
