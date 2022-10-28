package org.example.traitement;

import org.example.Dessin;
import org.example.figures.Figure;

public interface TraitementStrategy {
    void traiter( Dessin dessin );
}
