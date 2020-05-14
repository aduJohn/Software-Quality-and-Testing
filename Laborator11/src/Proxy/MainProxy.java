package Proxy;

public class MainProxy {
    public static void main(String[] args) {
        Client client = new Client("Ion");
        Credit credit = new Credit(client);
        credit.oferaCredit("RON");
        credit.oferaCredit("EURO");
        ProxyCredit proxyCredit = new ProxyCredit(credit);
        proxyCredit.oferaCredit("EURO");
        proxyCredit.oferaCredit("RON");
    }
}
