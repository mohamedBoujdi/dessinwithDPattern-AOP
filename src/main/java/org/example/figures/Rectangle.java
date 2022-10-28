package org.example.figures;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Rectangle extends Figure{
    private float L;
    private float H;
    @Override
    public double perimetre() {
            return (L+H)*2;
    }

    @Override
    public double surface() {
        return L*H;
    }

    @Override
    public void dessiner() {
        //show rectangle
        System.out.println("Rectangle:");
        System.out.println("L: "+L);
        System.out.println("H: "+H);
        System.out.println("Surface: "+surface());
        System.out.println("Perimetre: "+perimetre());
    }
}
