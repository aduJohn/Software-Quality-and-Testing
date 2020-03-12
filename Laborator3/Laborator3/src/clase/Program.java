package clase;

import readere.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        AngajatReader reader = new AngajatReader("angajati.txt");
        ElevReader elevReader = new ElevReader("elevi.txt");
        StudentReader studentReader = new StudentReader("studenti.txt");

        List<AplicantReader> readers = new ArrayList<>();
        readers.add(reader);
        readers.add(elevReader);
        readers.add(studentReader);
        List<Aplicant> aplicanti = ReaderAplicanti.readAplicants(readers);
        ReaderAplicanti.printAplicants(aplicanti);
    }
}
