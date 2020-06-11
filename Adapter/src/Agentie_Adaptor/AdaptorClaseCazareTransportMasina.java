package Agentie_Adaptor;

public class AdaptorClaseCazareTransportMasina extends MasinaInchiriata implements PachetTuristic {
    public AdaptorClaseCazareTransportMasina(String numeMasina) {
        super(numeMasina);
    }

    @Override
    public void descrierePachet() {
        System.out.println("S-a achizionat pachetul turistic cu cazare transport si masina inchiriata");
        super.inchiriazaMasina();
    }
}
