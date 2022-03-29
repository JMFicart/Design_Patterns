package Labyrinthe.Builder;

import Labyrinthe.Interfaces.LabyrintheFactory;

public class ArrayLabyrintheBuilder implements LabyrintheBuilder {
    private ArrayLabyrinthe labyrinthe;
    private LabyrintheFactory factory;

    @Override
    public void begin(int nbLig, int nbCol, LabyrintheFactory factory) {
        this.factory = factory;
        labyrinthe = new ArrayLabyrinthe(nbLig, nbCol);
    }

    @Override
    public void addMur(int lig, int col) {
        labyrinthe.addElement(factory.createMur(), lig, col);
    }

    @Override
    public void addPorte(int lig, int col) {
        labyrinthe.addElement(factory.createPorte(), lig, col);
    }

    @Override
    public void addPiece(int lig, int col) {
        labyrinthe.addElement(factory.createPiece(), lig, col);
    }

    @Override
    public void setEntry(int lig, int col) {
        labyrinthe.setEntry(lig, col);
    }

    @Override
    public void end() {

    }

    @Override
    public Labyrinthe getLabyrinthe() {
        return this.labyrinthe;
    }
}
