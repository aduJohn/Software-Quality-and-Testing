package Agentie_Facade;

public class FacadeRezervarePachetCazareTransport {
    private Hotel hotel;
    private AgentieAeriana agentieAeriana;

    public FacadeRezervarePachetCazareTransport(Hotel hotel, AgentieAeriana agentieAeriana) {
        this.hotel = hotel;
        this.agentieAeriana = agentieAeriana;
    }

    public void rezervaPachetCazareTransport(String pornire,String destinatie,String oraPornire,int durata){
        this.hotel.rezervaCameraHotel();
        this.agentieAeriana.rezervaZbor(pornire,destinatie,oraPornire,durata);
    }
}
