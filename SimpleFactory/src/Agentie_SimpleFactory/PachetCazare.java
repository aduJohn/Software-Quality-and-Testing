package Agentie_SimpleFactory;

public class PachetCazare extends PachetTuristic {

    public PachetCazare(double pret) {
        super(pret);
    }

    @Override
    public void descrierePachet() {
        System.out.println("Pachet turistic cu cazare la un pret de "+pret);
    }
}
