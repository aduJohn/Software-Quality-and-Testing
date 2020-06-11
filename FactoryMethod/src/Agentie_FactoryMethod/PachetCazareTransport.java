package Agentie_FactoryMethod;

public class PachetCazareTransport extends PachetTuritic {
    public PachetCazareTransport(double pret) {
        super(pret);
    }

    @Override
    public void descrierePachet() {
        System.out.println("Acest pachet cu cazare si transport are un pret de "+pret);
    }
}
