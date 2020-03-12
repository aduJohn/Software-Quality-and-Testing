package readere;

import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ReaderAplicanti {
    public static List<Aplicant> readAplicants(List<AplicantReader> readere){
        List<Aplicant> aplicantiCititi = new ArrayList<Aplicant>();
        for(AplicantReader reader : readere){
            try{
                aplicantiCititi.addAll(reader.citesteAplicanti());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return aplicantiCititi;
    }
    public static void printAplicants(List<Aplicant> aplicanti){
        if(aplicanti!=null){
            for(Aplicant aplicant:aplicanti){
                System.out.println(aplicant.toString());
            }
        }
    }
}
