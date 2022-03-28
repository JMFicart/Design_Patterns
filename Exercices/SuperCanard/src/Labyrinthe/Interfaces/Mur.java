package Labyrinthe.Interfaces;

public interface Mur extends LabyrintheElement{
    @Override
    default String getDescription() {
        return "Mur";
    }
}
