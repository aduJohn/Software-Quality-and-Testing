package Facade;

public class Facade {
    public static boolean verificaPersoana(Persoana persoana){
        if(persoana.getVarsta()>18){
            if(!Politie.esteUrmarit(persoana.getCNP())){
                if(!ANAF.areCreante(persoana.getCNP())){
                    return true;
                }
            }
        }
        return false;
    }
}
