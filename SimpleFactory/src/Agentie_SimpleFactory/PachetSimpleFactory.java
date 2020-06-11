package Agentie_SimpleFactory;

public class PachetSimpleFactory {
    public PachetTuristic createPachet(TipPachet tipPachet, double pret){
        switch (tipPachet){
            case CAZARE:
                return new PachetCazare(pret);
            case TRANSPORT:
                return new PachetTransport(pret);
            case CAZARE_TRANSPORT:
                return new PachetCazareTransport(pret);
            default:
                return null;
        }
    }
}
