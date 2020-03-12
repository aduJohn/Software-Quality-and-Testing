package readere;

import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    private String fileName;
    public String getFileName() {
        return fileName;
    }

    public AplicantReader(String fileName) {
        this.fileName = fileName;
    }

    public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException;

    public void citesteAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = input.nextInt();
        int punctaj = input.nextInt();
        int nrProiecte = input.nextInt();
        String[] denumiriProiecte = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++) {
            denumiriProiecte[i] = input.next();
        }
        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNrProiecte(nrProiecte, denumiriProiecte);
    }
}
