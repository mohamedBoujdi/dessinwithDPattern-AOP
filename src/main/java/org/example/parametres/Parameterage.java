package org.example.parametres;

import org.example.figures.Figure;
import org.example.observable.Observable;

public class Parameterage implements Observable {
    private int epaisseurContour;
    private int couleurContour;
    private int couleurRemplissage;

    @Override
    public void addObserver(Figure obs) {

    }

    @Override
    public void removeObserver(Figure obs) {

    }

    @Override
    public void notifyObserver() {

    }
}
