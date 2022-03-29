package Labyrinthe.Interfaces;

import Labyrinthe.Visitor.LabyrintheVisitor;

public interface LabyrintheElement {
    String getDescription();

    LabyrinthePosition getPosition();

    void setPosition(LabyrinthePosition position);

    void accepterVisiteur(LabyrintheVisitor visitor);
}
