package cts.popescu.alexandru.ionut.g1081.patternChainOfResponsibility;

public class Calator implements ICalator {

    @Override
    public void deplaseaza(int numarKm) {
        System.out.println("Calatorul s-a deplasat "+numarKm+" kilometrii.");
    }
}
