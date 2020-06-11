package Agentie_Facade;

public class AgentieAeriana {
    private String nume;

    public AgentieAeriana(String nume) {
        this.nume = nume;
    }

    public void rezervaZbor(String pornire,String destinatie,String oraPornire,int durata){
        Zbor zbor = new Zbor(pornire,destinatie,oraPornire,durata);
        System.out.println(zbor);
    }
}
