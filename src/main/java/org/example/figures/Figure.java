package org.example.figures;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.parametres.Parameterage;
@Data
@NoArgsConstructor
public abstract class Figure {
    private Point point;
    private Parameterage parameterage;
    public abstract double perimetre();
    public abstract double surface();
    public abstract void dessiner();
}

