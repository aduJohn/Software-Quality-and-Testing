package Agentie_SimpleFactory;

public abstract class PachetTuristic {
    protected double pret;

    public PachetTuristic(double pret) {
        this.pret = pret;
    }

    public abstract void descrierePachet();
}
