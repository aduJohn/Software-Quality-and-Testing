package Agentie_Adaptor;

public class MasinaInchiriata {
    private String numeMasina;

    public MasinaInchiriata(String numeMasina) {
        this.numeMasina = numeMasina;
    }

    public void inchiriazaMasina(){
        System.out.println("S-a inchiriat masina cu numele "+this.numeMasina);
    }
}
