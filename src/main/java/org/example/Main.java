package org.example;

import org.example.figures.Cercle;
import org.example.figures.Figure;
import org.example.figures.Rectangle;
import org.example.figures.composant.GroupFigure;
import org.example.traitement.ColorerCounteur;
import org.example.traitement.EpaisserCounteur;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args)  {

        Dessin dessin = new Dessin();
        dessin.setFigure(new Cercle());
        dessin.setFigure(new Rectangle());
        Figure figure = new GroupFigure();
        ((GroupFigure) figure).addFigure(new Cercle());
        dessin.setFigure(figure);
        dessin.affiche();
        /*System.out.println("===========================**utiliser les traitement 1 **==========================");
        ColorerCounteur colorerCounteur = new ColorerCounteur();
        dessin.setTraitement(colorerCounteur);
        dessin.affiche();
        System.out.println("===========================**utiliser les traitement 2 **==========================");
        EpaisserCounteur epaisserCounteur = new EpaisserCounteur();
        dessin.setTraitement(epaisserCounteur);
        dessin.affiche();
        System.out.println("===========================**utiliser les traitement 3 **==========================");
        dessin.setTraitement(colorerCounteur);
        dessin.affiche();
         */
        try {
            dessin.serialize(Path.of("dessin.bin"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
