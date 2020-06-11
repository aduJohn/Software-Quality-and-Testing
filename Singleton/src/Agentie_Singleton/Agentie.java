package Agentie_Singleton;

public class Agentie {
    private static Agentie instanta;
    private Agentie(){

    }
    public static synchronized Agentie getInstance(){
        if(instanta ==null){
            instanta = new Agentie();
        }
        return instanta;
    }
}
