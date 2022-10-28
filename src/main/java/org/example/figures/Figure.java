package org.example.figures;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.parametres.Parametrage;
@Data
@NoArgsConstructor
public abstract class Figure {
    private Point point;
    private Parametrage parametrage;
    public abstract double perimetre();
    public abstract double surface();
    public abstract void dessiner();
    //observer update
    public void update(Parametrage parametrage){
        this.parametrage = parametrage;
    }
}

