package Agentie_Command;

public class ComandaVanzare implements IComanda {
    private PachetTuristic pachetTuristic;

    public ComandaVanzare(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void executaComanada() {
        pachetTuristic.vanzare();
    }
}
