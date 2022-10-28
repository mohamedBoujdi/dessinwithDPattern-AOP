package org.example.figures;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class Cercle extends Figure{
    private int rayon;

    public Cercle() {
        this.rayon =1;
    }
    @Override
    public double perimetre() {
            return 2*Math.PI*rayon;//2*PI*r
    }

    @Override
    public double surface() {
        return 2*Math.PI*Math.pow(rayon,2);//PI*r^2
    }

    @Override
    public void
    dessiner() {
      //show cercle
        System.out.println("Cercle:");
        System.out.println("Rayon: "+rayon);
        System.out.println("Surface: "+surface());
        System.out.println("Perimetre: "+perimetre());

    }

}
