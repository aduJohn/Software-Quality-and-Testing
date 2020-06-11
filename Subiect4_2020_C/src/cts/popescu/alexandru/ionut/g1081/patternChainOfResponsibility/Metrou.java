package cts.popescu.alexandru.ionut.g1081.patternChainOfResponsibility;

public class Metrou extends Handler {
    @Override
    public void deplasareAutovehicul(Calator calator, int numarKm) {
        if(numarKm<15){
            System.out.println("Deplasare utilizand metroul");
            calator.deplaseaza(numarKm);
        }else{
            this.getNextHandler().deplasareAutovehicul(calator,numarKm);
        }
    }
}
