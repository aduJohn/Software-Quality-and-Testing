package Agentie_Facade;

public class MainFacade {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Azuga");
        Hotel hotel2 = new Hotel("Predeal");
        AgentieAeriana agentieAeriana1 = new AgentieAeriana("Tarom");
        AgentieAeriana agentieAeriana2 = new AgentieAeriana("WizAir");
        FacadeRezervarePachetCazareTransport facadeRezervarePachetCazareTransport = new FacadeRezervarePachetCazareTransport(hotel1,agentieAeriana2);
        facadeRezervarePachetCazareTransport.rezervaPachetCazareTransport("Romania","Bulgaria","10:30AM",2);
        FacadeRezervarePachetCazareTransport facadeRezervarePachetCazareTransport2 = new FacadeRezervarePachetCazareTransport(hotel2,agentieAeriana1);
        facadeRezervarePachetCazareTransport2.rezervaPachetCazareTransport("Romania","SUA","9:00AM",12);
    }
}
