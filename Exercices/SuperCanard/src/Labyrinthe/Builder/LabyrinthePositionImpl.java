package Labyrinthe.Builder;

import Labyrinthe.Interfaces.LabyrinthePosition;

import java.util.Objects;

public class LabyrinthePositionImpl implements LabyrinthePosition {
    private int line;
    private int column;

    public LabyrinthePositionImpl(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabyrinthePositionImpl that = (LabyrinthePositionImpl) o;
        if (line != that.line) return false;
        return column == that.column;
    }

    @Override
    public int hashCode() {
        int result = line;
        result = 31 * result + column;
        return result;
    }

    public void getPosition(){

    }
}
