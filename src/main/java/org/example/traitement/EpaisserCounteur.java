package org.example.traitement;

import org.example.Dessin;
import org.example.figures.Figure;
import org.example.parametres.Parametrage;

public class EpaisserCounteur implements TraitementStrategy {
    @Override
    public void traiter(Dessin dessin) {
        //traiter epaisseur les figures
        Parametrage parametrage = new Parametrage();
        dessin.getFigures().stream().forEach(figure -> {
            parametrage.setEpaisseurContour(figure.getParametrage().getEpaisseurContour()+ 1);
            figure.setParametrage(parametrage);
        });
    }
}
