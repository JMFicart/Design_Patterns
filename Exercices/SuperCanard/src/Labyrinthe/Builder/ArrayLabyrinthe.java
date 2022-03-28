package Labyrinthe.Builder;

import Labyrinthe.Interfaces.LabyrintheElement;

public class ArrayLabyrinthe implements Labyrinthe{
    private LabyrintheElement[][] grille;

    public ArrayLabyrinthe(int nbLine, int nbColumn){}

    void addElement(LabyrintheElement element, int line, int column){}

    void setEntry(int line, int column){}

    @Override
    public LabyrintheElement getEntry() {
        return null;
    }

    @Override
    public LabyrintheElement getElement(LabyrintheElement element, Direction direction) {
        return null;
    }
}
