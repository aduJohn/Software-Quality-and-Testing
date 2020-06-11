package Agentie_Decorator;

public class MainDecorator {
    public static void main(String[] args) {
        PachetCazare pachetCazare = new PachetCazare();
        pachetCazare.descrierePachet();
        DecoratorConcretPachetTuristic decoratorConcretPachetTuristic = new DecoratorConcretPachetTuristic(pachetCazare);
        decoratorConcretPachetTuristic.descrierePachet();
        decoratorConcretPachetTuristic.anularePachetRezervat();
    }
}
