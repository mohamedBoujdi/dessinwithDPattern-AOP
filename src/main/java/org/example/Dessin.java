package org.example;

import org.example.figures.Figure;
import org.example.traitement.TraitementStrategy;

public class Dessin {
    private Figure[] figures;
    private TraitementStrategy traitementStrategy;

    public Dessin(Figure[] figures) {
        this.figures = figures;
    }

    public void affiche() {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }
    public void serialize() {
        // TODO
    }
    public void setTraitement(TraitementStrategy traitementStrategy) {
        this.traitementStrategy = traitementStrategy;
    }
}
