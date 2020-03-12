package readere;

import clase.Aplicant;
import clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    public ElevReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.getFileName()));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev elev = new Elev();
            super.citesteAplicant(input, elev);
            int clasa = input.nextInt();
            String tutore = input.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        input.close();
        return elevi;
    }
}
