package Labyrinthe.Interfaces;

import Labyrinthe.Builder.Direction;

public interface LabyrinthePosition {
    default LabyrinthePosition getPosition(Direction direction){
        return null;
    }
}
