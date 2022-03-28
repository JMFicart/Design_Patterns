package Labyrinthe.Interfaces;

public interface Porte extends LabyrintheElement {
    @Override
    default String getDescription() {
        return "Porte";
    }
}
