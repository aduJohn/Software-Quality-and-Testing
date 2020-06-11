package Agentie_FactoryMethod;

public class PachetCazare extends PachetTuritic {
    public PachetCazare(double pret) {
        super(pret);
    }

    @Override
    public void descrierePachet() {
        System.out.println("Acest pachet cu cazare are un pret de "+pret);
    }
}
