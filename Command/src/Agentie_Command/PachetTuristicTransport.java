package Agentie_Command;

public class PachetTuristicTransport implements PachetTuristic {
    private String cod;

    public PachetTuristicTransport(String cod) {
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println("S-a vandut pachetul turistic cu transport avand codul "+cod);
    }

    @Override
    public void rezervare() {
        System.out.println("S-a rezervat pachetul turistic cu transport avand codul "+cod);
    }
}

