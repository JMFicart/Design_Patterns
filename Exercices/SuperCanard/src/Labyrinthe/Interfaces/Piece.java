package Labyrinthe.Interfaces;

public interface Piece extends LabyrintheElement {
    @Override
    default String getDescription() {
        return "Piece";
    }
}
