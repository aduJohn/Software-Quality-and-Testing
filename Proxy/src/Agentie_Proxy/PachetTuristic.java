package Agentie_Proxy;

public class PachetTuristic implements IPachetTuristic {
    private String code;
    private Persoana persoana;
    public PachetTuristic(String code,Persoana persoana) {
        this.code = code;
        this.persoana = persoana;
    }

    @Override
    public void rezervaPachetTuristic() {
        System.out.println("Persoana "+persoana.toString()+" a rezervat un pachet cu codul "+this.code);
    }

    public Persoana getPersoana() {
        return persoana;
    }

    public String getCode() {
        return code;
    }
}
