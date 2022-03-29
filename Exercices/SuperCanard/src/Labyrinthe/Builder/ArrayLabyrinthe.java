package Labyrinthe.Builder;

import Labyrinthe.Interfaces.LabyrintheElement;
import Labyrinthe.Interfaces.LabyrinthePosition;

public class ArrayLabyrinthe implements Labyrinthe{
    private LabyrintheElement[][] grille;
    private LabyrinthePositionImpl entry;

    public ArrayLabyrinthe(int nbLine, int nbColumn){
        grille = new LabyrintheElement[nbLine][nbColumn];
        entry = new LabyrinthePositionImpl(0,0);
    }

    void addElement(LabyrintheElement element, int line, int column){
        grille[line][column]=element;
        element.setPosition(new LabyrinthePositionImpl(line, column));
    }

    void setEntry(int line, int column){
        this.entry = new LabyrinthePositionImpl(line, column);
    }

    @Override
    public LabyrintheElement getEntry() {
        return grille[entry.getLine()][entry.getColumn()];
    }

    @Override
    public LabyrintheElement getElement(LabyrintheElement element, Direction direction) {
//        LabyrinthePosition destination = origine.getPosition().getPosition(direction);
        return null;
    }
}
