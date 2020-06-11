package Agentie_FactoryMethod;

public class FabricaPachetCazare implements FabricaPachet {
    @Override
    public PachetTuritic crearePachet(double pret) {
        return new PachetCazare(pret);
    }
}
