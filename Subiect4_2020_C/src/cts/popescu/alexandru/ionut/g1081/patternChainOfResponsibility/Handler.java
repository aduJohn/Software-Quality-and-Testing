package cts.popescu.alexandru.ionut.g1081.patternChainOfResponsibility;

public abstract class Handler {
    private Handler nextHandler;

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public abstract void deplasareAutovehicul(Calator calator,int numarKm);
}
