package AdapterBanca;

import Framework.CreditLeasing;

public class AdapterCredit implements InterfataCredit{
    private CreditLeasing creditLeasing;

    public AdapterCredit(CreditLeasing creditLeasing) {
        this.creditLeasing = creditLeasing;
    }

    @Override
    public void oferaCredit() {
        creditLeasing.oferaLeasing();
    }

    @Override
    public double calculeazaRata(int numarLuni) {
        return creditLeasing.calculareSumaPlataLunara();
    }
}
