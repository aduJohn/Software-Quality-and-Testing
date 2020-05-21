package Flyweight;

public class ContBancar {
    private String nrCont;
    private double sumaCont;

    public ContBancar(String nrCont, double sumaCont) {
        this.nrCont = nrCont;
        this.sumaCont = sumaCont;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "nrCont='" + nrCont + '\'' +
                ", sumaCont=" + sumaCont +
                '}';
    }
}
