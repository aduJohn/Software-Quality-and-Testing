package Agentie_SimpleFactory;

public class PachetTransport extends PachetTuristic {
    public PachetTransport(double pret) {
        super(pret);
    }

    @Override
    public void descrierePachet() {
        System.out.println("Pachet turistic cu transport la un pret de "+pret);
    }
}
