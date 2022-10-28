package org.example.figures.composant;

import lombok.Data;
import org.example.figures.Figure;

import java.util.ArrayList;
import java.util.List;

public class GroupFigure extends Figure {
    private List<Figure> figures=new ArrayList<>();


    @Override
    public double perimetre() {
        return figures.stream().mapToDouble(Figure::perimetre).sum();
    }

    @Override
    public double surface() {
        return figures.stream().mapToDouble(Figure::surface).sum();
    }

    @Override
    public void dessiner() {
        //show group figure
    System.out.println("GroupFigure:");
        figures.forEach(Figure::dessiner);
    }

    public void addFigure(Figure figure) {
        figures.add(figure);
    }
    public void removeFigure(Figure figure) {
        figures.remove(figure);
    }
    public List<Figure> getFigures() {
        return figures;
    }
}
