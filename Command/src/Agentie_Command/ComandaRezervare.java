package Agentie_Command;

public class ComandaRezervare implements IComanda {
    private PachetTuristic pachetTuristic;

    public ComandaRezervare(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void executaComanada() {
        pachetTuristic.rezervare();
    }
}
