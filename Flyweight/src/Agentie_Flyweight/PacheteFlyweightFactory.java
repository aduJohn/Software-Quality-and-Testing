package Agentie_Flyweight;

import java.util.HashMap;

public class PacheteFlyweightFactory {
    private HashMap<String,IPachetTuristic> pachete;

    public PacheteFlyweightFactory() {
        this.pachete = new HashMap<String,IPachetTuristic>();
    }
    public IPachetTuristic getPachetTuristic(String code,String hotel, String destinatie, boolean micDejun){
        IPachetTuristic pachetTuristic = pachete.get(code);
        if(pachetTuristic == null){
            pachetTuristic = new PachetTuristic(code,hotel,destinatie,micDejun);
            pachete.put(code,pachetTuristic);
        }
        return pachetTuristic;
    }
    public int getNumarPachete(){
        return this.pachete.size();
    }
}
