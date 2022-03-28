package Labyrinthe.Builder;

import Labyrinthe.Interfaces.LabyrintheElement;

public interface Labyrinthe {
    LabyrintheElement getEntry();
    LabyrintheElement getElement(LabyrintheElement element, Direction direction);
}
