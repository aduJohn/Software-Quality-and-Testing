package Agentie_FactoryMethod;

public abstract class PachetTuritic {
    protected double pret;

    public PachetTuritic(double pret) {
        this.pret = pret;
    }

    public abstract void descrierePachet();
}
