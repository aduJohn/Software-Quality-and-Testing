package Agentie_Command;

public class MainCommand {
    public static void main(String[] args) {
        PachetTuristicCazare pachetTuristicCazare = new PachetTuristicCazare("A2");
        PachetTuristicCazare pachetTuristicCazare2 = new PachetTuristicCazare("A3");
        PachetTuristicCazare pachetTuristicCazare3 = new PachetTuristicCazare("B5");
        PachetTuristicCazare pachetTuristicCazare4 = new PachetTuristicCazare("B2");

        PachetTuristicTransport pachetTuristicTransport = new PachetTuristicTransport("Q1");
        PachetTuristicTransport pachetTuristicTransport2 = new PachetTuristicTransport("Q2");
        PachetTuristicTransport pachetTuristicTransport3 = new PachetTuristicTransport("Q3");
        PachetTuristicTransport pachetTuristicTransport4 = new PachetTuristicTransport("T5");

        ComandaVanzare comandaVanzare = new ComandaVanzare(pachetTuristicCazare);
        ComandaVanzare comandaVanzare2 = new ComandaVanzare(pachetTuristicCazare2);
        ComandaVanzare comandaVanzare3 = new ComandaVanzare(pachetTuristicCazare3);
        ComandaVanzare comandaVanzare4 = new ComandaVanzare(pachetTuristicCazare);

        ComandaRezervare comandaRezervare = new ComandaRezervare(pachetTuristicCazare2);
        ComandaRezervare comandaRezervare2 = new ComandaRezervare(pachetTuristicCazare3);
        ComandaRezervare comandaRezervare3 = new ComandaRezervare(pachetTuristicCazare4);
        ComandaRezervare comandaRezervare4 = new ComandaRezervare(pachetTuristicCazare4);

        Operator operator = new Operator("Mihai");
        Operator operator2 = new Operator("Ioana");
        operator.preiaComanda(comandaVanzare);
        operator.preiaComanda(comandaRezervare2);
        operator.preiaComanda(comandaVanzare3);
        operator.preiaComanda(comandaRezervare3);
        operator.executaComanda();
        operator.executaToateComenzile();

        operator2.preiaComanda(comandaRezervare);
        operator2.preiaComanda(comandaVanzare2);
        operator2.preiaComanda(comandaRezervare4);
        operator2.executaToateComenzile();
        operator2.preiaComanda(comandaVanzare4);
        operator2.executaComanda();
        operator2.executaComanda();
    }
}
