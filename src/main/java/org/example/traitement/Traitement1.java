package org.example.traitement;

import org.example.figures.Figure;

public class Traitement1 implements TraitementStrategy {
    @Override
    public void traiter(Figure[] figures) {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }
}
