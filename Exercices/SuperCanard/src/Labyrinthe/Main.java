package Labyrinthe;

import Labyrinthe.Builder.ArrayLabyrintheBuilder;
import Labyrinthe.Builder.Direction;
import Labyrinthe.Builder.Joueur;
import Labyrinthe.Builder.Labyrinthe;
import Labyrinthe.Chateau.ChateauFactory;
import Labyrinthe.File.LabyrintheFileReader;
import Labyrinthe.Interfaces.LabyrintheFactory;
import Labyrinthe.Jardin.JardinFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Direction d;
        LabyrintheFactory factory = getFactory("Chateau");

        ArrayLabyrintheBuilder builder = new ArrayLabyrintheBuilder();
        LabyrintheFileReader filereader = new LabyrintheFileReader();
        filereader.read(new File("lab1.txt"), builder, factory);

        Labyrinthe laby = builder.getLabyrinthe();

        Scanner scan = new Scanner(System.in);
        Joueur joueur = new Joueur(laby);

        do {
            System.out.println("direction (n,e,s,o): ");
            switch (scan.nextLine()) {
                case "n": d = Direction.Nord;
                case "e": d = Direction.Est;
                case "s": d = Direction.Sud;
                case "o": d = Direction.Ouest;
                default: d = null;
            };
            if (d != null) {
                joueur.move(d);
            }
        } while (! joueur.isFinish());

        System.out.println("gagné");
    }

    private static LabyrintheFactory getFactory(String type) {
        LabyrintheFactory factory=null;
        switch (type){
            case "Chateau":
                factory = new ChateauFactory();
                break;
            case "Jardin":
                factory = new JardinFactory();
                break;
        }
        return factory;
    }
}
