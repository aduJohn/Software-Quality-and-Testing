package Agentie_Decorator;

public abstract class DecoratorAbstractPachetTuristic implements PachetTuristic{
    private PachetTuristic pachetTuristic;

    public DecoratorAbstractPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void descrierePachet() {
        pachetTuristic.descrierePachet();
    }

    public abstract void anularePachetRezervat();
}
