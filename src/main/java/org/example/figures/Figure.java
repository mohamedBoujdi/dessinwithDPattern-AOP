package org.example.figures;

import org.example.parametres.Parameterage;

public abstract class Figure {
    private Point point;
    private Parameterage parameterage;
    public abstract double perimetre();
    public abstract double surface();
    public abstract void dessiner();
}
