package Agentie_FactoryMethod;

public class FabricaPachetTransport implements FabricaPachet {
    @Override
    public PachetTuritic crearePachet(double pret) {
        return new PachetTransport(pret);
    }
}
