package Agentie_State;

public class Neplatita implements StareRezervare {
    @Override
    public void descriereStare() {
        System.out.println("Rezervarea curenta este neplatita!");
    }
}
