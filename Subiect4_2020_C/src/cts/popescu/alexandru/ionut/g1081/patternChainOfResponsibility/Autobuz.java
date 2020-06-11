package cts.popescu.alexandru.ionut.g1081.patternChainOfResponsibility;

public class Autobuz extends Handler {
    @Override
    public void deplasareAutovehicul(Calator calator,int numarKm) {
        if(numarKm<5){
            System.out.println("Deplasare utilizand autobuzul");
            calator.deplaseaza(numarKm);
        }else{
            this.getNextHandler().deplasareAutovehicul(calator,numarKm);
        }
    }
}
