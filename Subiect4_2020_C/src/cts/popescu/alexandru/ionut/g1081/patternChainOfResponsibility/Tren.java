package cts.popescu.alexandru.ionut.g1081.patternChainOfResponsibility;

public class Tren extends Handler {
    @Override
    public void deplasareAutovehicul(Calator calator, int numarKm) {
        System.out.println("Deplasare utilizand trenul");
        calator.deplaseaza(numarKm);
    }
}
