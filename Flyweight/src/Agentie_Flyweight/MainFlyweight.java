package Agentie_Flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic1 =
                new PachetTuristic("P1","Triumf","Predeal",true);
        PachetTuristic pachetTuristic2 =
                new PachetTuristic("P2","Triumf","Azuga",false);
        PachetTuristic pachetTuristic3 =
                new PachetTuristic("A3","Ardyn","Predeal",true);
        Optionale optionale1 = new Optionale(true,2);
        Optionale optionale2 = new Optionale(true,5);
        PacheteFlyweightFactory pacheteFlyweightFactory = new PacheteFlyweightFactory();
        IPachetTuristic pachetFlyweight1 =  pacheteFlyweightFactory.getPachetTuristic("P1","Ardeal","Ceva",true);
        pachetFlyweight1.descrierePachet(optionale1);
        IPachetTuristic pachetFlyweight2 =  pacheteFlyweightFactory.getPachetTuristic("P3","Ardeal","Ceva",true);
        pachetFlyweight2.descrierePachet(optionale2);

    }
}
