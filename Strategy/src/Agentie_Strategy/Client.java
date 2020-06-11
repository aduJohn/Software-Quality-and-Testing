package Agentie_Strategy;

public class Client {
    private IPlata modalitatePlata;

    public Client(IPlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platestePachet(float suma){
        modalitatePlata.plateste(suma);
    }

    public void setModalitatePlata(IPlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }
}
