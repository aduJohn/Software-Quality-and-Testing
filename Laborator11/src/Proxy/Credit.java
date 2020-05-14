package Proxy;

public class Credit implements ICredit {
    private Client client;

    public Credit(Client client) {
        this.client = client;
    }

    @Override
    public void oferaCredit(String moneda) {
        System.out.println("Clientul "+this.client.getNume()+" a luat un credit in "+moneda);
    }
}
