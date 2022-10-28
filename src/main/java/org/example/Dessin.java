package org.example;

import org.example.figures.Figure;
import org.example.traitement.TraitementStrategy;

import java.util.List;

public class Dessin {
    private List<Figure> figures;
    private TraitementStrategy traitementStrategy;

    public Dessin(Figure figures) {
        this.figures.add(figures);
    }

    public void setTraitement(TraitementStrategy traitementStrategy) {
        this.traitementStrategy = traitementStrategy;
    }
    public void affiche() {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }
    public void serialize() {
        // TODO
    }
}
