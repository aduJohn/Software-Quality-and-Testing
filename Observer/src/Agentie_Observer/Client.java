package Agentie_Observer;

public class Client implements IClient{
    private String nume;
    private String varsta;

    public Client(String nume, String varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void notificareOferta(String oferta) {
        System.out.println("Pentru tine draga client "+nume+" a aparut o noua oferta: ");
        System.out.println(oferta);
    }
}
