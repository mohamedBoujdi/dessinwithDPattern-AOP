package org.example.traitement;

import org.example.figures.Figure;
import org.example.parametres.Parametrage;

public class RemplissageCouleur implements TraitementStrategy {
    @Override
    public void traiter(Figure figure) {
        //triter les figures
        Parametrage parametrage = new Parametrage();
        parametrage.setCouleurRemplissage(figure.getParametrage().getCouleurRemplissage()+ 1);
    }
}
