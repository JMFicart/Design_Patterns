package Labyrinthe.Interfaces;

public interface Piece extends LabyrintheElement {
    @Override
    String getDescription();

    public void setPosition();
}
