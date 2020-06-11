package Agentie_Adaptor;

public class AdaptorObiectCazareTransportMasina implements PachetTuristic {
    private MasinaInchiriata masinaInchiriata;

    public AdaptorObiectCazareTransportMasina(MasinaInchiriata masinaInchiriata) {
        this.masinaInchiriata = masinaInchiriata;
    }

    @Override
    public void descrierePachet() {
        System.out.println("S-a achizionat pachetul turistic cu cazare transport si masina inchiriata");
        masinaInchiriata.inchiriazaMasina();
    }
}
