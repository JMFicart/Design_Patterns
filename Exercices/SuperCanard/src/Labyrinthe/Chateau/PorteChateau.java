package Labyrinthe.Chateau;

import Labyrinthe.AbstractLabyrintheElement;
import Labyrinthe.Interfaces.Porte;
import Labyrinthe.Visitor.LabyrintheVisitor;

public class PorteChateau extends AbstractLabyrintheElement implements Porte{
    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public void accepterVisiteur(LabyrintheVisitor visitor) {

    }

    @Override
    public void setPosition() {

    }
}
