package Agentie_Proxy;

public class MainProxy {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Mihai",23);
        Persoana persoana2 = new Persoana("Andrei",17);
        PachetTuristic pachetTuristic = new PachetTuristic("1",persoana2);
        ProxyPachetTuristic proxyPachetTuristic = new ProxyPachetTuristic(pachetTuristic);
        pachetTuristic.rezervaPachetTuristic();
        proxyPachetTuristic.rezervaPachetTuristic();
    }
}
