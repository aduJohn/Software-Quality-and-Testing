package Agentie_Command;

public class PachetTuristicCazare implements PachetTuristic {
    private String cod;

    public PachetTuristicCazare(String cod) {
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println("S-a vandut pachetul turistic cu cazare avand codul "+cod);
    }

    @Override
    public void rezervare() {
        System.out.println("S-a rezervat pachetul turistic cu cazare avand codul "+cod);
    }
}
