package Agentie_Proxy;

public class ProxyPachetTuristic implements IPachetTuristic {
    private PachetTuristic pachetTuristic;

    public ProxyPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void rezervaPachetTuristic() {
        if(pachetTuristic.getPersoana().getVarsta()>18){
            System.out.println("Persoana "+pachetTuristic.getPersoana().toString()+" a rezervat un pachet cu codul "+pachetTuristic.getCode());
        }else{
            System.out.println("Nu s-a putut face rezervarea");
        }
    }
}
