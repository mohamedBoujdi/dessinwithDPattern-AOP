package org.example.observable;

import org.example.figures.Figure;

public interface Observable {
    public void addObserver(Figure obs);
    public void removeObserver(Figure obs);
    public void notifyObserver();
}
