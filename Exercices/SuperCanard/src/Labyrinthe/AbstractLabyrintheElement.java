package Labyrinthe;

import Labyrinthe.Interfaces.LabyrinthePosition;

public abstract class AbstractLabyrintheElement {
    private LabyrinthePosition position;

    public LabyrinthePosition getPosition() {
        return position;
    }

    public void setPosition(LabyrinthePosition position) {
        this.position = position;
    }
}
