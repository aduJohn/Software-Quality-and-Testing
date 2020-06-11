package cts.popescu.alexandru.ionut.g1081.patternChainOfResponsibility;

public class Tramvai extends Handler {
    @Override
    public void deplasareAutovehicul(Calator calator, int numarKm) {
        if(numarKm<10){
            System.out.println("Deplasare utilizand tramvaiul");
            calator.deplaseaza(numarKm);
        }else{
            this.getNextHandler().deplasareAutovehicul(calator,numarKm);
        }
    }
}
