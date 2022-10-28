package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;
import org.example.figures.Figure;
import org.example.traitement.EpaisserCounteur;
import org.example.traitement.TraitementStrategy;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Data
public class Dessin implements Serializable {
    @FieldNameConstants.Exclude
    private List<Figure> figures=new ArrayList<>();
    private TraitementStrategy traitementStrategy;


    public Dessin() {
        this.traitementStrategy = new EpaisserCounteur();
    }
    public void setFigure(Figure figure) {
        this.figures.add(figure);
    }
    public void setTraitement(TraitementStrategy traitementStrategy) {
        this.traitementStrategy = traitementStrategy;
    }
    public void affiche() {
        if (traitementStrategy != null) {
            traitementStrategy.traiter(this);
        }
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }

    //serialize en binaire
    public void serialize(Path path) throws IOException {
        traitementStrategy.traiter(this);
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            oos.writeObject(this);
            oos.close();
        }

    }
    //deserialize le binaire
    public Dessin deserialize(Path path) throws IOException, ClassNotFoundException {
        File file = new File(path.toString());
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dessin dessin = (Dessin) ois.readObject();
        ois.close();
        return dessin;
    }

}
