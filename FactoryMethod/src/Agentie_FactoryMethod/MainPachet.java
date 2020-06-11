package Agentie_FactoryMethod;

public class MainPachet {
    public static void afisarePachet(FabricaPachet fabricaPachet, double pret){
        PachetTuritic pachetTuritic = fabricaPachet.crearePachet(pret);
        pachetTuritic.descrierePachet();
    }
    public static void main(String[] args) {
        afisarePachet(new FabricaPachetCazare(),250);
        afisarePachet(new FabricaPachetTransport(),50);
        afisarePachet(new FabricaPachetCazareTransport(),300);
    }
}
