package Agentie_Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Client client1 = new Client(new Card());
        client1.platestePachet(500);
        client1.setModalitatePlata(new Cash());
        client1.platestePachet(1500);
        client1.setModalitatePlata(new Paypal());
        client1.platestePachet(243);
    }
}
