package org.example.traitement;

import org.example.figures.Figure;
import org.example.parametres.Parameterage;

public class ColorerCounteur implements TraitementStrategy {
    @Override
    public void traiter(Figure figure) {
         //traiter la couleur de la figures
        Parameterage parameterage = new Parameterage();
        parameterage.setCouleurContour(132);
        figure.setParameterage(parameterage);
    }
}
