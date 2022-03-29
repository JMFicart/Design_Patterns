package Labyrinthe.File;

import Labyrinthe.Builder.LabyrintheBuilder;
import Labyrinthe.Interfaces.LabyrintheFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LabyrintheFileReader {
    void read(File file, LabyrintheBuilder builder, LabyrintheFactory factory) throws FileNotFoundException {
        try (Scanner scan = new Scanner(file)) {
            ArrayList<String> list = new ArrayList<>();
            int nbLine = 0;
            int nbCol = 0;
            while (scan.hasNextLine()){
                nbLine++;
                String s = scan.nextLine();
                if (s.length() > nbCol){
                    nbCol = s.length();
                }
            }
            builder.begin(nbLine, nbCol, factory);
            for (int lig = 0; lig < list.size(); lig++){
                String s = list.get(lig);
                for (int col = 0; col < s.length(); col++){
                    switch (s.charAt(col)) {
                        case ' ':
                            builder.addPiece(lig, col);
                            break;

                        case 'p':
                            builder.addPorte(lig, col);
                            break;

                        case 'e':
                            builder.setEntry(lig, col);
                            break;

                        case '*':
                            builder.addMur(lig, col);
                            break;
                    }

                }
            }
        }
    }
}
