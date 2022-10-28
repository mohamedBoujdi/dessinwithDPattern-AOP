package org.example.traitement;

import org.example.Dessin;
import org.example.figures.Figure;
import org.example.parametres.Parametrage;

public class RemplissageCouleur implements TraitementStrategy {
    @Override
    public void traiter(Dessin dessin) {
        //triter les figures
        Parametrage  parametrage = new Parametrage();
        dessin.getFigures().stream().forEach(figure -> {
            parametrage.setCouleurRemplissage(figure.getParametrage().getCouleurRemplissage()+ 1);
            figure.setParametrage(parametrage);
        });
    }
}
