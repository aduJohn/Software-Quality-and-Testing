package Agentie_SimpleFactory;

public class PachetCazareTransport extends PachetTuristic {
    public PachetCazareTransport(double pret) {
        super(pret);
    }

    @Override
    public void descrierePachet() {
        System.out.println("Pachet turistic cu cazare si transport la un pret de "+pret);
    }
}
