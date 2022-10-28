package org.example.traitement;

import org.example.figures.Figure;

public class Traitement2 implements TraitementStrategy {
    @Override
    public void traiter(Figure[] figures) {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }
}
