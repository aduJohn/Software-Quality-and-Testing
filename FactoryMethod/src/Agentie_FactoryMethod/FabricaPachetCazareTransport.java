package Agentie_FactoryMethod;

public class FabricaPachetCazareTransport implements FabricaPachet {
    @Override
    public PachetTuritic crearePachet(double pret) {
        return new PachetCazareTransport(pret);
    }
}
