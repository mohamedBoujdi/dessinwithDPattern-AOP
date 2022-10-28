package org.example.parametres;

import lombok.Getter;
import lombok.experimental.FieldNameConstants;
import org.example.figures.Figure;
import org.example.observable.Observable;

import java.util.List;

//@Data
@Getter
public class Parametrage implements Observable {
    //observers
   //exclude field from lombok
    @FieldNameConstants.Exclude
    private List<Figure> observers;
    private int epaisseurContour;
    private int couleurContour;
    private int couleurRemplissage;

    public Parametrage(int epaisseurContour, int couleurContour, int couleurRemplissage) {
        this.epaisseurContour = epaisseurContour;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
        notifyObserver();
    }
    public Parametrage() {
        //by default
        this.epaisseurContour = 1;
        this.couleurContour = 0;
        this.couleurRemplissage = 0;
        notifyObserver();
    }

    public void setEpaisseurContour(int epaisseurContour) {
         this.epaisseurContour=epaisseurContour;
            notifyObserver();
    }

    public void setCouleurContour(int couleurContour) {
        this.couleurContour=couleurContour;
        notifyObserver();
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage=couleurRemplissage;
        notifyObserver();
    }

    @Override
    public void addObserver(Figure obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Figure obs) {
            observers.remove(obs);
    }

    @Override
    public void notifyObserver() {
        if (observers != null) {
            observers.stream().forEach(obs->obs.update(this));
        }
    }
}
