package Agentie_FactoryMethod;

public class PachetTransport extends PachetTuritic {
    public PachetTransport(double pret) {
        super(pret);
    }

    @Override
    public void descrierePachet() {
        System.out.println("Acest pachet cu transport are un pret de "+pret);
    }
}
