package org.example.traitement;

import org.example.figures.Figure;
import org.example.parametres.Parameterage;

public class EpaisserCounteur implements TraitementStrategy {
    @Override
    public void traiter(Figure figure) {
        //traiter epaisseur les figures
        Parameterage parameterage = new Parameterage();
        parameterage.setEpaisseurContour(figure.getParameterage().getEpaisseurContour()+ 1);
        figure.setParameterage(parameterage);
    }
}
