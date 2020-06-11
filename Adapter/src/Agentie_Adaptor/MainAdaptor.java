package Agentie_Adaptor;

public class MainAdaptor {
    public static void afisarePachetTuristic(PachetTuristic pachetTuristic){
        pachetTuristic.descrierePachet();
    }
    public static void main(String[] args) {
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata("BMW");
        PachetCazareTransport pachetCazareTransport = new PachetCazareTransport();
        AdaptorClaseCazareTransportMasina adaptorClase = new AdaptorClaseCazareTransportMasina("Audi");
        AdaptorObiectCazareTransportMasina adaptorObiecte = new AdaptorObiectCazareTransportMasina(masinaInchiriata);
        afisarePachetTuristic(pachetCazareTransport);
        afisarePachetTuristic(adaptorClase);
        afisarePachetTuristic(adaptorObiecte);
    }
}
