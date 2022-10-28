package org.example.traitement;

import org.example.Dessin;
import org.example.figures.Figure;
import org.example.parametres.Parametrage;

public class ColorerCounteur implements TraitementStrategy {
    @Override
    public void traiter(Dessin dessin) {
         //traiter la couleur de la figures
        Parametrage parametrage1 = new Parametrage();
        dessin.getFigures().stream().forEach(figure -> {
            parametrage1.setCouleurContour(figure.getParametrage().getCouleurContour()+ 1);
            figure.setParametrage(parametrage1);
        });
    }
}
