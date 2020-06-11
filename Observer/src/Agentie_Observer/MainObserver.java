package Agentie_Observer;

public class MainObserver {
    public static void main(String[] args) {
        Client client1 = new Client("Alex","23");
        Client client2 = new Client("Vlad","24");
        Client client3 = new Client("Ioana","43");
        Oferta oferta1 = new Oferta();
        oferta1.adaugaClient(client1);
        oferta1.adaugaClient(client3);
        oferta1.trimiteOferta();
        oferta1.setMesaj("Oferta 30% la Predea;");
        oferta1.adaugaClient(client2);
        oferta1.stergeClient(client1);
        oferta1.trimiteOferta();

    }
}
