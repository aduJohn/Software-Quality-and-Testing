package Facade;

public class MainFacade {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("1981107460094");
        if(persoana.getVarsta()>18){
            if(!Politie.esteUrmarit(persoana.getCNP())){
                if(!ANAF.areCreante(persoana.getCNP())){
                    System.out.println("Contul pentru aceasta persoana se poate crea cu succes!");
                }
            }
        }
    }
}
